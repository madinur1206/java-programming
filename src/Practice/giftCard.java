package Practice;

import java.util.*;

public class giftCard {
    public static void main(String[] args) {
        int balance = 100;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter item name: ");
        String item = scan.nextLine();
        if (item.equals("Smartphones") || item.equals("Laptop")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equals("Blanket")) {
            balance = balance - 60;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equals("Charger")) {
            balance = balance - 25;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equals("Hat")) {

            balance = balance - 25;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equals("Headphones")) {
            balance = balance - 30;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equals("Pants")) {
            balance = balance - 50;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equals("Pillow")) {
            balance = balance - 40;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equals("Socks")) {
            balance = balance - 5;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equals("USB cable")) {
            balance = balance - 10;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else {
            System.out.println("Invalid item!");
        }

    }
}