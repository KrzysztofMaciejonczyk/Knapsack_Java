package org.example;

import java.util.ArrayList;
import java.util.List;

public class Result {
    private List<Item> finalItems = new ArrayList<>();
    private int totalValue = 0;
    private int totalWeight = 0;

    public int getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

    public List<Item> getFinalItems() {
        return finalItems;
    }

    public void setFinalItems(List<Item> finalItems) {
        this.finalItems = finalItems;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Final items in the backpack:\n");
        for (Item item : finalItems) {
            sb.append("Item: " + item.getIndex() + " Weight: " + item.getWeight() + " Value:" + item.getValue() + "\n");
        }
        sb.append("Total Items: " + finalItems.size() + "\n");
        sb.append("Total Value: " + totalValue + "\n");
        sb.append("Total Weight: " + totalWeight + "\n");
        return sb.toString();
    }
}
