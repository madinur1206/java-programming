package day24_loops;
import java.util.Scanner;
public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int secretPincode= 1234;
        int pinCode;
        do {
            System.out.println("Enter your pin code:");
             pinCode = scan .nextInt() ;
        }while(secretPincode !=pinCode );
        System.out.println("Welcome to your account");

    }
}
