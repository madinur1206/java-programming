package OfficeHours.practice_5_03_2021;
/*
Given an array of passwords (String). Hide each password as a star (*) and show the hidden passwordEx:Input:{"one", "hi", "hold}Output: [ ***, **, **** ]
 */

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    public static void main(String[] args) {
        String [] password= {"one", "hi", "hold"};
        ArrayList<String> hiddenPassword= new ArrayList<>() ;
        // use helper method
        for(String each:password){
            hiddenPassword .add(convertToStars(each) );
        }
        System.out.println("original: "+ Arrays.toString(password ));
        System.out.println("hidden: " +hiddenPassword );

    }
    public static String convertToStars(String str){
        String stars= "";
        for (int i = 0; i < str.length() ; i++) {
            stars +="*";

        }
        return  stars ;
    }
}
