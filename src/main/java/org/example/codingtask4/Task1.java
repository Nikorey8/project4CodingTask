package org.example.codingtask4;

public class Task1 {
    public static void main(String[] args) {

        // Write a program to swap 2 String without a temporary variable?

        String a="Java is fun";
        String b="but sometimes its hard";

        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println(a);
        System.out.println(b);
    }
}
