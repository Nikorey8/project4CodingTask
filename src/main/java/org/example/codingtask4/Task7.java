package org.example.codingtask4;

public class Task7 {
    //Count the Number of Words in a String:
    // Write a function to count the number of words in a given string.
    // Words are separated by spaces or punctuation.
    // For example, the input "Hello, world!" should return 2.
    static int countWords(String s){
        return s.split("[.,?!\\s]+").length;

    }

    public static void main(String[] args) {

        System.out.println(countWords("Hello, world"));
    }

}
