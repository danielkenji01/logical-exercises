package com.daniel.test;

/**
 * Write a program that prints the numbers from 1 to 100.
 * But for multiples of three print "Fizz" instead of the number and for multiples of five print "Buzz".
 * For numbers which are multiples of both three and five print "FizzBuzz"
 */
public class Exercise1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String message = generateMessageFromMultiples(i);

            System.out.println(message);
        }
    }

    static String generateMessageFromMultiples(int number) {
        boolean multipleOfThree = number % 3 == 0;
        boolean multipleOfFive = number % 5 == 0;

        StringBuilder builder = new StringBuilder();

        if (multipleOfThree) {
            builder.append("Fizz");
        }

        if (multipleOfFive) {
            builder.append("Buzz");
        }

        String message = builder.toString();

        return builder.length() > 0 ? message : String.valueOf(number);
    }

}