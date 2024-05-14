package org.example.codingtask4;

public class Task4 {
        //Check if a String is Palindrome: Determine whether a given string is a palindrome,
        // which means it reads the same forwards and backward.
        // For example, "madam" is a palindrome.

     public static boolean isPalindrome(String name){
         String reversedStr="";

         for (int i = name.length()-1; i >=0 ; i--) {
             reversedStr+=name.charAt(i);
         }

         if(name.equalsIgnoreCase(reversedStr)){
             return true;
         }else{
             return false;
         }

     }

    public static void main(String[] args) {

        System.out.println(isPalindrome("madam"));
    }

}
