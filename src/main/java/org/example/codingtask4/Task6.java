package org.example.codingtask4;

public class Task6 {
    //Create a method to count how many vowels are present in a string “documentation”

  public static void vowelCount(String word){

      String string1=word.replaceAll("[^AEIOUaeiou]","");

      System.out.println(string1.length());
  }

    public static void main(String[] args) {

      vowelCount("documentation");
    }

}


