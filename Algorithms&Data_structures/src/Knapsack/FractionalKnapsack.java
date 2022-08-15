package Knapsack;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        final Item item_1 = new Item(4, 20);
        final Item item_2 = new Item(3, 18);
        final Item item_3 = new Item(2, 14);

        final Item[] items = {item_1, item_2, item_3};

        Arrays.sort(items, Comparator.comparingDouble(Item::valuePerUnitOfWeight).reversed());
        System.out.println(Arrays.toString(items));

        final int knapsack_weight = 7;

        int weight_so_far = 0;
        double value_so_far = 0;
        int current_item = 0;

        while (current_item < items.length && weight_so_far != knapsack_weight) {
            if (weight_so_far + items[current_item].getWeight() < knapsack_weight) {
                value_so_far += items[current_item].getValue();
                weight_so_far += items[current_item].getWeight();
            }else{
                value_so_far += ((knapsack_weight - weight_so_far)/ (double) items[current_item].getWeight())*items[current_item].getValue();
                weight_so_far = knapsack_weight;
            }
            current_item++;
        }

        System.out.println("Ценность наилучшего набора: " + value_so_far);

    }
}

class Item {
    private final int weight;
    private final int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    public double valuePerUnitOfWeight() {
        return value / (double) weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return
                "{weight=" + weight +
                        ", value=" + value +
                        '}';
    }
}
