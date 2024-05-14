package org.example.codingtask4;

import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        //How can you remove all duplicates from ArrayList?

        List<Integer> duplicatesList=new ArrayList<>();
        duplicatesList.add(1);
        duplicatesList.add(1);
        duplicatesList.add(1);
        duplicatesList.add(2);
        duplicatesList.add(3);
        duplicatesList.add(4);
        duplicatesList.add(5);

        Set<Integer> newSet=new HashSet<>(duplicatesList);
        System.out.println(newSet);

    }

}
