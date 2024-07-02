package com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}

public class ConsumerExample2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("John", 25),
            new Person("Jane", 30),
            new Person("Tom", 35)
        );

        // Consumer to increase the age of each person by 1
        Consumer<Person> ageIncrementConsumer = person -> person.age += 1;

        // Apply the consumer to each person in the list
        people.forEach(ageIncrementConsumer);

        // Print the updated list
        people.forEach(System.out::println);

        System.out.println("");
        
        Consumer<List<Person>> incrementAndPrint = list -> {
            list.forEach(ageIncrementConsumer);
            list.forEach(System.out::println);
        };

        incrementAndPrint.accept(people);
    }
}

