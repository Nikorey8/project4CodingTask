package org.example.codingtask4;

public class Task2 {
    public static void main(String[] args) {
        //Find out how many alpha characters are present in a string?

        String str="i love java";
        int count=0;

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(Character.isLetter(ch)){
                count++;
            }

        }
        System.out.println(count);


        String str1="ahahsfdd23343@#@#(*";
        str1=str1.replaceAll("[^A-Za-z]","");
        System.out.println(str1.length());
    }



}


