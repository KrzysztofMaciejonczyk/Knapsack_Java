package org.example;

public class Item {
    private int value;
    private int weight;
    private int index;
    private float weightPerValue;

    public Item(int index, int value, int weight, float per) {
        this.index = index;
        this.value = value;
        this.weight = weight;
        this.weightPerValue = per;
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public float getWeightPerValue() {
        return weightPerValue;
    }

    public void setWeightPerValue(float weightPerValue) {
        this.weightPerValue = weightPerValue;
    }
}
