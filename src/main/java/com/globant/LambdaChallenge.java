package com.globant;



public class LambdaChallenge {

    public static PerformOperation isOdd() {
        return n -> n % 2 != 0;
    }

    public static PerformOperation isPrime() {
        return n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
    }

    public static PerformOperation isPalindrome() {
        return n -> {
            String str = String.valueOf(n);
            return str.equals(new StringBuilder(str).reverse().toString());
        };
    }

    public static void main(String[] args) {
        PerformOperation op;
        System.out.println("Test Cases:");

        // Test isOdd
        op = isOdd();
        System.out.println(op.check(3)); // true
        System.out.println(op.check(4)); // false

        // Test isPrime
        op = isPrime();
        System.out.println(op.check(5)); // true
        System.out.println(op.check(10)); // false

        // Test isPalindrome
        op = isPalindrome();
        System.out.println(op.check(121)); // true
        System.out.println(op.check(123)); // false
    }
}

