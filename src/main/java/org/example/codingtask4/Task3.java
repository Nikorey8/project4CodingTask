package org.example.codingtask4;

public class Task3 {

    // Reverse a String: Write a function to reverse a given string.
    // For example, given the input "Hello", the output should be "olleH".

    public static void reversedStr(String name){
        String name1="";
        for (int i = name.length()-1; i>=0 ; i--) {
            name1+=name.charAt(i);
        }
        System.out.println(name1);

    }

    public static void main(String[] args) {

        reversedStr("hello");
    }
    }



