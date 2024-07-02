package com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Double> values = Arrays.asList(20.5d, 100d, 26d, 50.5d, 400d);
        Consumer<List<Double>> sqrtConsumer = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, Math.sqrt(list.get(i)));
            }
        };

        Consumer<List<Double>> printConsumer = list -> list.stream().forEach(System.out::println);
        Consumer<List<Double>> printConsumer2 = list -> list.stream().forEach(element -> System.out.println(element));

        sqrtConsumer.andThen(printConsumer).accept(values);
        printConsumer2.accept(values);
    }
}