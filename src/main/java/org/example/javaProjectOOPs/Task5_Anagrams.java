package org.example.javaProjectOOPs;

import java.util.Arrays;

public class Task5_Anagrams {
    static boolean checkAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
//        Check if Two Strings are Anagrams: Given two strings,
//        determine if they are anagrams, meaning they contain the same characters
//        in a different order. For example, "listen" and "silent" are anagrams.
        String str1 = "silent";
        String str2 = "listen";

        if (checkAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
