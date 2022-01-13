package com.daniel.test;

/**
 * Write a program that prints the numbers from 1 to 100.
 * But for multiples of three print "Fizz" instead of the number and for multiples of five print "Buzz".
 * For numbers which are multiples of both three and five print "FizzBuzz"
 */
public class Exercise1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

            boolean multiploDe3 = i % 3 == 0;
            boolean multiploDe5 = i % 5 == 0;

            if (multiploDe3 && multiploDe5) {
                System.out.println("FizzBuzz");
            } else if (multiploDe3) {
                System.out.println("Fizz");
            } else if (multiploDe5) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

}