package org.example.javaProjectOOPs;

public class Task4_Palindrome {
    void checkPalindrome(String str){
        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();

        if(str.equals(str1.toString())){
            System.out.println(str + " is a palindrome");
        } else{
            System.out.println(str + " is not a palindrome");
        }
    }
    public static void main(String[] args) {
        Task4_Palindrome palindromeCheck = new Task4_Palindrome();
        palindromeCheck.checkPalindrome("Hello");
    }
}
