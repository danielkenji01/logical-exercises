package com.daniel.test;

/**
 * Suppose that we're given a moment of time written as HH:MM, where HH is the hour and MM is the minutes,
 * and a clock that beeps every time a creepy moment happens.
 * Let's say that a moment is considered creepy if it is formatted as AB:AB, AA:BB, AB:BA or AA:AA.
 * You are given a String[] moments, where each element represents a single moment of time.
 * Return how many times the clock beeped.
 * For example, for an input {"11:00","13:13","10:00"}, the result would be 2.
 */
public class Exercise3 {

    public static void main(String[] args) {
        String[] moments = new String[]{"11:11", "10:10", "11:22", "10:01", "10:00", "15:21"};

        System.out.println(checkMoments(moments));
    }

    private static int checkMoments(String[] moments) {

        int totalMoments = 0;

        for (String moment : moments) {
            moment = moment.replace(":", "");

            char zero = moment.charAt(0);
            char um = moment.charAt(1);
            char dois = moment.charAt(2);
            char tres = moment.charAt(3);

            if (zero == um && um == dois && dois == tres) {
                totalMoments++;
            } else if (zero == um && dois == tres) {
                totalMoments++;
            } else if (zero == dois && um == tres) {
                totalMoments++;
            } else if (zero == tres && um == dois) {
                totalMoments++;
            }
        }

        return totalMoments;
    }

}