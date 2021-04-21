package OfficeHours.practice_3_30_2021;
import java. util.Scanner;
public class MaxNumberFrom5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int max= 0;
        int min= 0;

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Enter a number ");
            int number = scan.nextInt();
            if(number>max){
                max= number;
            }
            if(number<min){
                min= number;
            }

        }
        System.out.println(max);
        System.out.println(min);
    }
}
