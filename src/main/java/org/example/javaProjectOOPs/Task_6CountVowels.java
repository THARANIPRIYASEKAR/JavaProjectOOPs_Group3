package org.example.javaProjectOOPs;

public class Task_6CountVowels {
    String str;
    int numberOfVowels;

    public static void main(String[] args) {
// Create a method to count how many vowels are
// present in a string “documentation”
        Task_6CountVowels obj = new Task_6CountVowels();
        obj.countVowels("documentation");
        System.out.println(obj.numberOfVowels);
    }

    int countVowels(String str) {
        this.str = str;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return numberOfVowels = count;
    }
}
