package day09_scanner_practice;
import java.util.Scanner;

public class Fahrenheit2CelsiusConverter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("#### F to C  CONVENTER PROGRAMM ####");
        System.out.println("Enter fahrenheit:");
        double fahrenheit = input.nextDouble() ;
        double celsius = (fahrenheit -32)*5/9;
        System.out.println(fahrenheit +" F is: "+ celsius +"C");

    }
}
