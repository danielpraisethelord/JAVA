package com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Consumer to print each number
        Consumer<Integer> printConsumer = System.out::println;

        // Use forEach to apply the consumer to each element of the list
        numbers.forEach(printConsumer);
    }
}