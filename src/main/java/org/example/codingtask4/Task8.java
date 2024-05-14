package org.example.codingtask4;

import java.util.ArrayList;
import java.util.List;

public class Task8 {
    //You have a list of strings, and you want to keep only those that
    // start with “A” and you want to return them in lower case.

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("April");
        strings.add("August");
        strings.add("May");
        strings.add("June");
        strings.add("December");
        strings.add("January");
        System.out.println(startWithA(strings));

    }
    public static List<String> startWithA(List<String> wordsA){

        List<String> newList=new ArrayList<>();

        for (String word:wordsA){
            if(word.startsWith("a")||word.startsWith("A")){
              newList.add(word.toLowerCase());
            }
        }
        return newList;
    }
}


