package org.example.javaProjectOOPs;

public class Task9_FirstNonRepeatingChar {
    //Find the First Non-Repeating Character in a String: Given a string, find and return the first non-repeating character.
    // For example, in the string "abracadabra", the first non-repeating character is 'c'.

    public static void main(String[] args) {

        String word = "connect";

        char doesNotRepeat = '\0';

        for (int i = 0; i < word.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < word.length(); j++) {
                if (i != j && word.charAt(i) == word.charAt(j)) {
                    unique = false;
                    break;
                }

            }
            if (unique) {
                System.out.println("The unique character is " + word.charAt(i));

                break;

            }
        }

    }
}
