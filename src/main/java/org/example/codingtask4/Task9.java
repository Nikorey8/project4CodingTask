package org.example.codingtask4;

public class Task9 {
    public static void main(String[] args) {
        //Find the First Non-Repeating Character in a String:
        // Given a string, find and return the first non-repeating character.
        // For example, in the string "abracadabra", the first non-repeating character is 'c'.

        String str = "abracadabra";

        for (int i = 0; i < str.length(); i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }


}

