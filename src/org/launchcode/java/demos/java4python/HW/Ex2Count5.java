package org.launchcode.java.demos.java4python.HW;

import java.util.ArrayList;

import static java.util.Arrays.asList;

/**
 * Created by Debbie on 3/5/2017.
 */

//print all words with 5 letters only

    public class Ex2Count5 {

        public static void main(String[] args) {
            ArrayList<String> words = new ArrayList<>();
            words.add("yeah");
            words.add("lunch");
            words.add("code");
            words.add("hello");

            FiveCharacterWords(words);
        }

        private static void FiveCharacterWords(ArrayList<String> words) {
            for (String word : words) {
                if (word.length() == 5) {
                    System.out.println(word + " has 5 characters");
                }
            }
        }

    }


