package com.daniel.test;

/**
 *  Marvin is addicted to 'Angry Birds’, which became huge in the vicinity of Betelgeuse.
 *  The game has multiple stages, and for each stage the player can gain between 0 and 3 stars, inclusive.
 *  You are given a String[] result, containing Marvin's results.
 *  For each stage, result[i] contains an element that specifies Marvin's result in that stage.
 *  For example, if he got 0 stars in stage i, result[i] would be “---”.
 *  For 1 star, result[i] would be “*--”, and so on.
 *  Return the total number of stars Marvin has at the moment.
 */
public class Exercise2 {

    public static void main(String[] args) {
        String[] result = new String[]{"***", "---", "**-", "-*-"};

        System.out.println(calcularTotalEstrelas(result));
    }

    private static int calcularTotalEstrelas(String[] result) {
        int totalEstrelas = 0;

        for (String res : result) {
            totalEstrelas += calcularTotalEstrelas(res);
        }

        return totalEstrelas;
    }

    private static int calcularTotalEstrelas(String res) {
        if (res == null) {
            return 0;
        }

        int totalEstrelas = 0;

        for (char c : res.toCharArray()) {
            if (c == '*') {
                totalEstrelas++;
            }
        }

        return totalEstrelas;
    }

}