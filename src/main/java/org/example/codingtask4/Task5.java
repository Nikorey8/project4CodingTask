package org.example.codingtask4;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Task5 {

        //Check if Two Strings are Anagrams: Given two strings,
        // determine if they are anagrams, meaning they contain the same characters in a different order.
        // For example, "listen" and "silent" are anagrams.

    public static boolean isAnagram(String s1,String s2){

        char [] arrayStr1=s1.toCharArray();
        char [] arrayStr2=s2.toCharArray();
        Arrays.sort(arrayStr1);
        Arrays.sort(arrayStr2);

        return Arrays.equals(arrayStr1,arrayStr2);
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("listen","silent"));
    }
}
