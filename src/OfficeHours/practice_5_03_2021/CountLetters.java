package OfficeHours.practice_5_03_2021;
/*
Given an ArrayList of Strings and a letter (char) print how many times the letter is found in the ArrayList elementsEx:Input:”java”, ”html”, “css”, “java”, “javascript”, “selenium”letter: ‘a’Output:6
 */

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetters {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "javascript", "java", "word"));
        char targetLetter = 'j';
        int count = 0;

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == targetLetter) {
                    count++;
                }
            }
        }

        System.out.println(targetLetter + " was found " + count +"times");
    }
}

