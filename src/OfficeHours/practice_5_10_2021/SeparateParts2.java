package OfficeHours.practice_5_10_2021;

import java.util.ArrayList;

public class SeparateParts2 {
    public static void main(String[] args) {
        System.out.println(separateParts("ABCD123$%#@&456EFG!") );

    }
    public static ArrayList<ArrayList<Character>> separateParts(String str) {
        ArrayList<ArrayList<Character>> all = new ArrayList<>();

        ArrayList<Character> letters= new ArrayList<>();
        ArrayList<Character>  digits= new ArrayList<>();
        ArrayList<Character>  special= new ArrayList<>();
        all.add(letters);
        all.add(digits);
        all.add(special );
        //all.add(new ArrayList<>());
        for (int i = 0; i < str.length();i++) {
            char eachChar= str.charAt(i) ;
            if(Character.isLetter(eachChar )) {
                all.get(0) .add(eachChar);
            }else if(Character.isDigit(eachChar ) ){
                all.get(1) .add(eachChar );
            }else {
                all.get(2) .add(eachChar );
            }

        }
        return all;
    }

}
