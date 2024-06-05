package org.example;

import java.util.*;

public class Problem {
    private int itemTypes;
    private int seed;
    private int lowerBound;
    private int upperBound;
    private List<Item> itemArray;
    public Problem(int itemTypes, int seed, int lowerBound, int upperBound) {
        if (lowerBound > upperBound) {
            throw new IllegalArgumentException("lowerBound > upperBound");
        }
        if (lowerBound <= 0) {
            throw new IllegalArgumentException("lowerBound <= 0");
        }
        if (itemTypes <= 0) {
            throw new IllegalArgumentException("itemTypes <= 0");
        }
        this.itemTypes = itemTypes;
        this.seed = seed;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.itemArray = new ArrayList<>();
        Random rand = new Random(seed);
        for (int i = 0; i < itemTypes; i++) {
            int value = rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int weight = rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
            float per = weight / (float)value;
            itemArray.add(new Item(i, value, weight, per));
        }
    }
    public List<Item> getItemArray() {
        return itemArray;
    }
    public Result Solve(int capacity) {
        if(capacity < 0) {
            throw new IllegalArgumentException("capacity < 0");
        }
        Result result = new Result();
        itemArray.sort(Problem::CompareByWeightPerValueThenByWeight);
        boolean backpackFull = false;
        int nextItem = 0;
        while (!backpackFull)
        {
            if (capacity - result.getTotalWeight() >= itemArray.get(nextItem).getWeight() && nextItem < itemArray.size())
            {
                result.getFinalItems().add(itemArray.get(nextItem));
                result.setTotalValue(result.getTotalValue()+itemArray.get(nextItem).getValue());
                result.setTotalWeight(result.getTotalWeight()+itemArray.get(nextItem).getWeight());
            }
            else if (nextItem < itemArray.size() - 1) {
                nextItem++;
            }
            else
            {
                backpackFull = true;
            }
        }
        return result;
    }
    public static int CompareByWeightPerValueThenByWeight(Item item1, Item item2)
    {
        if (item1.getWeightPerValue() == item2.getWeightPerValue())
        {
            return Integer.compare(item1.getWeight(), item2.getWeight());
        }
        else
        {
            return Float.compare(item1.getWeightPerValue(), item2.getWeightPerValue());
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Items to choose from:\n");
        for (Item item : itemArray) {
            sb.append("Item: " + item.getIndex() + " Weight: " + item.getWeight() + " Value:" + item.getValue() + "\n");
        }
        return sb.toString();
    }
}
