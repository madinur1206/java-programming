package OfficeHours.practice_04_27_2021;
/*
[Anagram]

Create a method that will accept two Strings. Check if the two Strings are anagram of each other. If they are anagram return true otherwise return false.

Anagram means the characters of the words are the same, but rearranged in different orders

For example:
    listen and silent are anagram because the characters in 'listen' can be rearranged to make 'silent'
 */

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("cba","abc") );

    }
    //to charArray  sort  equal
    //loop through one string  remove the char that you iterate through
    // in the second string if empty the 2rd string is empty
    public static boolean isAnagram (String one, String two){
        if (one.length() != two.length() ){
            return false;
            //listen  l+1 i+1
            //silent  s-1 i-1
        }
        one= one.toLowerCase() ;
        two= two.toLowerCase() ;
        int [] count = new int[26];
        //a-0,
        //z-25;

        for (int i = 0; i <one.length() ; i++) {

            char letterFromOne = one.charAt(i) ;
            char letterFromtwo = two.charAt(i) ;
            count[letterFromOne-97]= count [letterFromOne-97]+1;
            count[letterFromtwo -97]= count [letterFromOne-97]-1;
        }
        return Arrays.equals(count,new int[26] );
    }
}
