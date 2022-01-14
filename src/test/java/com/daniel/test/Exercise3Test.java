package com.daniel.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Exercise3Test {

    /**
     * AA:AA format
     */
    @Test
    void test_moment_all_equal() {
        String[] moments = new String[]{"11:11", "22:22", "21:32"};

        int totalMoments = Exercise3.checkMoments(moments);

        Assertions.assertEquals(2, totalMoments);
    }

    /**
     * AA:BB format
     */
    @Test
    void test_moment_first_and_second_then_third_and_fourth() {
        String[] moments = new String[]{"11:22", "22:44", "21:32", "00:55"};

        int totalMoments = Exercise3.checkMoments(moments);

        Assertions.assertEquals(3, totalMoments);
    }

    /**
     * AB:AB format
     */
    @Test
    void test_moment_first_and_third_then_second_and_fourth() {
        String[] moments = new String[]{"12:12", "23:23", "21:21", "01:45"};

        int totalMoments = Exercise3.checkMoments(moments);

        Assertions.assertEquals(3, totalMoments);
    }

    /**
     * AB:BA format
     */
    @Test
    void test_moment_first_and_fourth_then_second_and_third() {
        String[] moments = new String[]{"12:21", "23:32", "21:12", "01:10"};

        int totalMoments = Exercise3.checkMoments(moments);

        Assertions.assertEquals(4, totalMoments);
    }

    @Test
    void test_zero_moments() {
        String[] moments = new String[]{"23:45", "12:11", "09:21", "20:12"};

        int totalMoments = Exercise3.checkMoments(moments);

        Assertions.assertEquals(0, totalMoments);
    }

}