package com.daniel.test;

/**
 *  In soccer leagues, the winner of a match is awarded with 3 points and the loser 0 points.
 *  In case of a tie, both teams are awarded with 1 point each.
 *  Given int[] wins and int[] ties, and knowing that the i'th element of wins and ties correspond to the number of wins and ties respectively for team i;
 *  return the number of points the champion team achieved in this league.
 *  For inputs wins = {1, 0, 3} and ties = {2, 2, 0}, the result would be 9 (the team at i=2 would win this championship).
 */
public class Exercise4 {

    private static final String FINAL_MESSAGE = "The champion is the team %s with %s points.";

    public static void main(String[] args) {
        int[] wins = new int[]{1, 2, 1, 3};
        int[] ties = new int[]{2, 2, 4, 1};

        int[][] matrixChampion = returnChampion(wins, ties);

        for (int[] ints : matrixChampion) {
            System.out.println(String.format(FINAL_MESSAGE, ints[0], ints[1]));
        }
    }

    static int[][] returnChampion(int[] wins, int[] ties) {
        int[] totalPoints = initializeArrayPoints(wins.length);

        calculatePoints(wins, totalPoints, 3);
        calculatePoints(ties, totalPoints, 1);

        int indexChampion = -1;
        int pointsChampion = -1;

        for (int i = 0; i < totalPoints.length; i++) {
            if (indexChampion == -1) {
                indexChampion = i;
                pointsChampion = totalPoints[i];
                continue;
            }

            if (totalPoints[i] > pointsChampion) {
                indexChampion = i;
                pointsChampion = totalPoints[i];
            }
        }

        return new int[][]{{indexChampion, pointsChampion}};
    }

    static void calculatePoints(int[] results, int[] totalPoints, int points) {
        for (int i = 0; i < results.length; i++) {
            totalPoints[i] += results[i] * points;
        }
    }

    static int[] initializeArrayPoints(int size) {
        int[] totalPoints = new int[size];

        for (int i = 0; i < size; i++) {
            totalPoints[i] = 0;
        }

        return totalPoints;
    }

}