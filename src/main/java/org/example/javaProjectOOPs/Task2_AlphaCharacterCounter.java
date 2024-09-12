package org.example.javaProjectOOPs;

//Find out how many alpha characters are present in a string

public class Task2_AlphaCharacterCounter {

    public static int countAlphaCharacters(String input) {
        int count = 0;

        // Iterate through each character in the string
        for (int i = 0; i < input.length(); i++) {

            //Character.isLetter() returns true if it string.charAt(i) is alpha character
            if (Character.isLetter(input.charAt(i))) {
                count++;
            }

        }
        return count;
    }


    public static void main(String[] args) {

        String input = "adbh23jhjhk#!4 3355";
        int count = countAlphaCharacters(input);

        //print the count
        System.out.println("The given string contains " + count + " alphabetic characters.");
    }

}
