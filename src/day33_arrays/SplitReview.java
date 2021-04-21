package day33_arrays;
import java.util.*;
public class SplitReview {
    public static void main(String[] args) {
        String word= "java";
        String [] array = word.split("a");
        System.out.println(array.length);
        int countOfA= array.length-1 ;
        if (word.endsWith("a") ){
            countOfA ++;
        }
        System.out.println("count of A= " + countOfA );

        String[] strArr= word.split("");
        System.out.println(Arrays.toString(strArr ) );

        String word1 = "java1sql2html";
        String []strArr1 = word1.split("\\d");
        System.out.println(Arrays.toString(strArr1 ));


        String password = "Madinur1206Qr@_!";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        }else{
            System.out.println("invalid password");
        }

    }
}

