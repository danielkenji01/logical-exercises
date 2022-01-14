package com.daniel.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Exercise4Test {

    @Test
    void test_points_wins() {
        int[] wins = new int[]{0, 1, 2, 3};

        int[] totalPoints = Exercise4.initializeArrayPoints(wins.length);

        Exercise4.calculatePoints(wins, totalPoints, 3);

        Assertions.assertEquals(totalPoints[0], 0);
        Assertions.assertEquals(totalPoints[1], 3);
        Assertions.assertEquals(totalPoints[2], 6);
        Assertions.assertEquals(totalPoints[3], 9);
    }

    @Test
    void test_points_ties() {
        int[] ties = new int[]{0, 1, 2, 3};

        int[] totalPoints = Exercise4.initializeArrayPoints(ties.length);

        Exercise4.calculatePoints(ties, totalPoints, 1);

        Assertions.assertEquals(totalPoints[0], 0);
        Assertions.assertEquals(totalPoints[1], 1);
        Assertions.assertEquals(totalPoints[2], 2);
        Assertions.assertEquals(totalPoints[3], 3);
    }

    @Test
    void test_champion() {
        int[] wins = new int[]{3, 1, 2, 1};
        int[] ties = new int[]{0, 10, 4, 9};

        int[][] ints = Exercise4.returnChampion(wins, ties);

        for (int[] anInt : ints) {
            Assertions.assertEquals(1, anInt[0]);
            Assertions.assertEquals(13, anInt[1]);
        }
    }

}