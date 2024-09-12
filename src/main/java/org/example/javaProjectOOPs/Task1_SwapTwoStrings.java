package org.example.javaProjectOOPs;

public class Task1_SwapTwoStrings {

    public static void main(String[] args) {

        //swap 2 Strings without a temporary variable
        String string1 = "First";
        String string2 = "Second";

        //print the strings before swap
        System.out.println("****Before Swap****");
        System.out.println(string1);
        System.out.println(string2);

        //swapping the strings without a temporary variable
        string1 = string1.concat(string2);
        string2 = string1.replace(string2, "");
        string1 = string1.replace(string2, "");


        //print the strings after swap
        System.out.println("****After Swap****");
        System.out.println(string1);
        System.out.println(string2);

    }
}
