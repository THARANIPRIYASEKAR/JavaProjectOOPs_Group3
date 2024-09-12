package org.example.javaProjectOOPs;

import java.util.ArrayList;

public class Task9_Lowercase {
    public static void main(String[] args) {
        ArrayList<String> items=new ArrayList<>();
        items.add("Jennifer");
        items.add("ADAM");
        items.add("ANNA");
        items.add("ERIC");
        items.add("MYLA");
        items.add("MILLENA");
        items.add("ANUSHA");
        items.add("MICHAEL");

        for (int i = 0; i < items.size(); i++) {
            if(items.toString().startsWith("A")){
                items.replaceAll(x->x.toLowerCase());
            }
        }
        System.out.println(items);
    }
}
