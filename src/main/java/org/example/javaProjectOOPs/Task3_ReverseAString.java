package org.example.javaProjectOOPs;

public class Task3_ReverseAString {
    void reverse (String str){
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
    public static void main(String[] args) {
        Task3_ReverseAString rev = new Task3_ReverseAString();
        rev.reverse("Hello");
    }

}
