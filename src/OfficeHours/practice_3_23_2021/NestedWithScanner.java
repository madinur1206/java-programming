package OfficeHours.practice_3_23_2021;
import java.util.Scanner;
public class NestedWithScanner {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in) ;
        System.out.println("Enter a number :");
        int num = input.nextInt();
        if(num>0){
            System.out.println("Enter a single word");
            String word = input.next();
            if(word.length() %2==0){
                System.out.println(word + " length is even ");
            }else {
                System.out.println(word+ "length  is odd");
            }

        }
    }
}
