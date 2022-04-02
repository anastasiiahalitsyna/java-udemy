package com.anastasiia.strings;

import java.util.Arrays;

public class SentimentAnalyzer {

    // Tip: labeled continue can be used when iterating featureSet + convert review to lower-case
    public static int[] detectProsAndCons(String review,
                                          String[][] featureSet,
                                          String[] posOpinionWords,
                                          String[] negOpinionWords) {
        int[] featureOpinions = new int[featureSet.length]; // output
        review = review.toLowerCase();

        NEXT_ROW_LOOP:
        for (int i = 0; i < featureSet.length; i++) {
            for (int j = 0; j < featureSet[i].length; j++) {// what is the value featureSet[4] ?
                final String feature = featureSet[i][j];
                int result = getOpinionOnFeature(review, feature, posOpinionWords, negOpinionWords);
                featureOpinions[i] = result;
                if (result == 1 || result == -1) {
                    continue NEXT_ROW_LOOP;
                }
            }
        }
        return featureOpinions;
    }

    // First invoke checkForWasPhrasePattern and
    // if it cannot find an opinion only then invoke checkForOpinionFirstPattern
    private static int getOpinionOnFeature(String review,
                                           String feature,
                                           String[] posOpinionWords,
                                           String[] negOpinionWords) {
        int result = checkForOpinionFirstPattern(review, feature, posOpinionWords, negOpinionWords);
        if (result == 0) {
            result = checkForWasPhrasePattern(review, feature, posOpinionWords, negOpinionWords);
        }
        return result;
    }

    // Tip: Look at String API doc. Methods like indexOf, length, substring(beginIndex), startsWith can come into play
    // Return 1 if positive opinion found, -1 for negative opinion, 0 for no opinion
    // You can first look for positive opinion. If not found, only then you can look for negative opinion
    private static int checkForWasPhrasePattern(String review,
                                                String feature,
                                                String[] posOpinionWords,
                                                String[] negOpinionWords) {
        // {feature} was {opinion}
        // today ice cream was bad kshjbf kjebnf kjbnrf : review // 6 + 14 = 20
        int opinion = 0;
        String pattern = feature + " was ";
        int firstIndex = review.indexOf(pattern);
        if (firstIndex < 0) {
            return 0;
        }

        int beginIndexOfOpinion = firstIndex + pattern.length();

        String afterPattern = review.substring(beginIndexOfOpinion);

        for (int i = 0; i < posOpinionWords.length; i++) {
            if (afterPattern.startsWith(posOpinionWords[i])) {
                opinion = 1;
                break;
            }
        }

        if (opinion == 0) {
            for (int i = 0; i < negOpinionWords.length; i++) {
                if (afterPattern.startsWith(negOpinionWords[i])) {
                    opinion = -1;
                    break;
                }
            }
        }
        return opinion;
    }

    // You can first look for positive opinion. If not found, only then you can look for negative opinion
    private static int checkForOpinionFirstPattern(String review,
                                                   String feature,
                                                   String[] posOpinionWords,
                                                   String[] negOpinionWords) {
        // Extract sentences as feature might appear multiple times.
        // split() takes a regular expression and "." is a special character
        // for regular expression. So, escape it to make it work!!
        String[] sentences = review.split("\\.");
        // your code for processing each sentence. You can return if opinion is found in a sentence
        // (no need to process subsequent ones)
        for (int i = 0; i < sentences.length; i++) {

            for (int posIndex = 0; posIndex < posOpinionWords.length; posIndex++) {
                String pattern = posOpinionWords[posIndex] + " " + feature;
                if (sentences[i].contains(pattern)) {
                    return 1;
                }
            }

            for (int negIndex = 0; negIndex < negOpinionWords.length; negIndex++) {
                String pattern = negOpinionWords[negIndex] + " " + feature;
                if (sentences[i].contains(pattern)) {
                    return -1;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        /*String review = "Haven't been here in years! Fantastic service and the food was delicious! " +
                "Definetly will be a frequent flyer! Francisco was very attentive";
*/
        String review = "Sorry OG, but you just lost some loyal customers. " +
                "Horrible service, no smile or greeting just attitude. The breadsticks were stale and burnt, " +
                "appetizer was cold and the food came out before the salad.";

        String[][] featureSet = {
                {"ambiance", "ambience", "atmosphere", "decor"},// i = 0
                {"dessert", "ice cream", "desert"},//i = 1
                {"food"},//i = 2
                {"soup"},// i = 3
                {"service", "management", "waiter", "waitress", "bartender", "staff", "server"}//i = 4 max i =4;
        };

        String[] posOpinionWords = {"good", "fantastic", "friendly", "great", "excellent", "amazing", "awesome",
                "delicious"};
        String[] negOpinionWords = {"slow", "bad", "horrible", "awful", "unprofessional", "poor"};

        int[] featureOpinions = detectProsAndCons(review, featureSet, posOpinionWords, negOpinionWords);
        System.out.println("Opinions on Features: " + Arrays.toString(featureOpinions));
    }
}
