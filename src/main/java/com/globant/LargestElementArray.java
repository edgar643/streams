package com.globant;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LargestElementArray {

/*
Given an array, find the second largest number.
            Example:
 Input: int arr[] = {12, 35, 1, 10, 34, 1}
    Output: 34.

    Input: int arr[] = {20, 5, 20}
    Output: 5
    Explanation: The largest element of
    the array is 20 and the second
    largest element is 5

    Input: int arr[] = {8, 8, 8}
    Output: null. (The second largest does not exist)
    Explanation: Largest element of the array
    is 8 there is no second largest element*/

    public static void main(String[] args) {
        int arr1[] = {12, 35, 1, 10, 34, 1};
        int arr2[] = {20, 5, 20};
        int arr3[] = {8, 8, 8};
        System.out.println("Second largest number is: " + getSecondLargest(arr1));
        System.out.println("Second largest number is: " + getSecondLargest(arr2));
        System.out.println("Second largest number is: " + getSecondLargest(arr3));
    }

    private static String getSecondLargest(int[] array) {

        List<Integer> list = Arrays.stream(array)
                                   .boxed()
                                   .distinct()
                                   .sorted()
                                   .toList();

        // Check if the list has at least two elements
        if(list.size() < 2) {
            return null;
        }
        // Get the second largest element
        var secondLargest = list.get(list.size() - 2);
        return secondLargest.toString();
    }
}
