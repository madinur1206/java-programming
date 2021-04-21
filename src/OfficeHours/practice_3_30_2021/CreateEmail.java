package OfficeHours.practice_3_30_2021;
import java.util.Scanner;
public class CreateEmail {
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
        System.out.println("Enter two words:");
        String wordOne = scan.nextLine() ;
        String wordTwo = scan.nextLine() ;
        String email ="";
        if(wordOne .length() >=6&&wordTwo .length() >=6){
            email= wordOne .substring(0,4);
            email +=wordTwo.substring(wordTwo .length() -3) ;
            email +="@cybertek.com";
            System.out.println(email );
        }else {
            System.out.println("invalid data");

        }
    }
}
