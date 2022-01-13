package com.daniel.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Exercise2Test {

    @Test
    void test_six_stars() {
        String[] result = new String[]{"***", "---", "**-", "-*-"};

        int totalStars = Exercise2.calculateTotalStars(result);

        Assertions.assertEquals(6, totalStars);
    }

    @Test
    void test_zero_stars() {
        String[] result = new String[]{"---", "---", "---"};

        int totalStars = Exercise2.calculateTotalStars(result);

        Assertions.assertEquals(0, totalStars);
    }

    @Test
    void test_three_stars() {
        String[] result = new String[]{"-*-", "*--", "--*"};

        int totalStars = Exercise2.calculateTotalStars(result);

        Assertions.assertEquals(3, totalStars);
    }

}