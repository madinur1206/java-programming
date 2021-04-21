package OfficeHours.practice_3_30_2021;
import java.util.Scanner;
public class DynamicLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Do you want upper case or lowercase");
        String upperOrLower = input.next();
        System.out.println("Do you want it in ascending or decending order");
        int starting ;
        int ending;
        if(upperOrLower.equals("uppercase")){
            starting = 'A';
            ending= 'Z';

        } else{
            starting ='a';
            ending= 'z';

        }


        for (int i = starting ; i <=ending  ; i++) {
            System.out.println((char)  i);

        }
    }

}
