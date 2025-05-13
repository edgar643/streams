package com.globant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamsExample {
    static List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");
    static List<String> NoOrderedNames = List.of("Charlie", "Eve", "Alice", "Bob", "David");
    static List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public static void main(String[] args) {
        filtering(names);
        randomize(names);
        sorting(NoOrderedNames);
        printPairNumber(numbers);
        printUnPairNumber(numbers);

    }

    private static void filtering(List<String> names) {
        //Filtering
        List<String> namesFiltered= names.stream()
                                         .filter(name -> name.startsWith("A"))
                                         .toList();
        System.out.println("Filtered names: " + namesFiltered);
    }

    private static void randomize(List<String> names) {
        //Randomize
        System.out.println("Original names: " + names);
        List<String> mutableNames = new ArrayList<>(List.copyOf(names)); // Create a mutable copy
        Collections.shuffle(mutableNames);
        System.out.println("Randomized names: " +mutableNames);
    }

    private static void sorting(List<String> names) {
        System.out.println("Original names: " + names);
        //Sorting
        List<String> sortedNames = names.stream()
                                        .sorted()
                                        .toList();
        System.out.println("Sorted names: " + sortedNames);
    }


    private static void printPairNumber(List<Integer> numbers) {
        numbers = numbers.stream()
                         .filter(num -> num % 2 == 0)
                         .toList();
        System.out.println("Pair numbers: " + numbers);
    }

    private static void printUnPairNumber(List<Integer> numbers) {
        numbers = numbers.stream()
                         .filter(num -> num % 2 != 0)
                         .toList();
        System.out.println("UnPair numbers: " + numbers);
    }
}

