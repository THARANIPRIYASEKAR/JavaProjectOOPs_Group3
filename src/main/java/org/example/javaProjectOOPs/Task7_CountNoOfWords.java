package org.example.javaProjectOOPs;

public class Task7_CountNoOfWords {
    //Count the Number of Words in a String: Write a function to count the number of words in a given string.
    // Words are separated by spaces or punctuation. For example, the input "Hello, world!" should return 2.
    public static void main(String[] args) {
        String str = "Git hub was giving me trouble today";

        String[] stringArray = str.split(" ");
        System.out.println(stringArray.length);
    }

}
