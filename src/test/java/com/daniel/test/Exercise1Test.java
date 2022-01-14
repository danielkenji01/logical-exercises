package com.daniel.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Exercise1Test {

    @Test
    void test_message_multiple_of_three() {
        String message = Exercise1.generateMessageFromMultiples(3);

        Assertions.assertEquals("Fizz", message);
    }

    @Test
    void test_message_multiple_of_five() {
        String message = Exercise1.generateMessageFromMultiples(10);

        Assertions.assertEquals("Buzz", message);
    }

    @Test
    void test_message_multiple_of_three_and_five() {
        String message = Exercise1.generateMessageFromMultiples(30);

        Assertions.assertEquals("FizzBuzz", message);
    }

    @Test
    void test_message_none_multiple_of_three_and_five() {
        String message = Exercise1.generateMessageFromMultiples(41);

        Assertions.assertEquals("41", message);
    }

}