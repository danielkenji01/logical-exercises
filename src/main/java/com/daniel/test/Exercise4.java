package com.daniel.test;

/**
 *  In soccer leagues, the winner of a match is awarded with 3 points and the loser 0 points.
 *  In case of a tie, both teams are awarded with 1 point each.
 *  Given int[] wins and int[] ties, and knowing that the i'th element of wins and ties correspond to the number of wins and ties respectively for team i;
 *  return the number of points the champion team achieved in this league.
 *  For inputs wins = {1,0,3} and ties = {2, 2, 0}, the result would be 9 (the team at i=2 would win this championship).
 */
public class Exercise4 {

    public static void main(String[] args) {
        int[] wins = new int[]{1, 2, 1, 2};
        int[] ties = new int[]{2, 2, 4, 1};

        System.out.println(definirCampeao(wins, ties));
    }

    private static String definirCampeao(int[] wins, int[] ties) {
        int[] totalPoints = calcularPontosVitoria(wins);

        totalPoints = calcularPontosEmpate(ties, totalPoints);

        int indexCampeao = -1;
        int pontosCampeao = -1;

        for (int i = 0; i < totalPoints.length; i++) {
            if (indexCampeao == -1) {
                indexCampeao = i;
                pontosCampeao = totalPoints[i];
                continue;
            }

            if (totalPoints[i] > pontosCampeao) {
                indexCampeao = i;
                pontosCampeao = totalPoints[i];
            }
        }

        return "The champion is the team " + indexCampeao + " with " + pontosCampeao + " points.";
    }

    private static int[] calcularPontosVitoria(int[] wins) {
        int[] totalPoints = new int[wins.length];

        for (int i = 0; i < wins.length; i++) {
            totalPoints[i] = wins[i] * 3;
        }

        return totalPoints;
    }

    private static int[] calcularPontosEmpate(int[] ties, int[] totalPoints) {
        for (int i = 0; i < ties.length; i++) {
            totalPoints[i] += ties[i];
        }

        return totalPoints;
    }

}