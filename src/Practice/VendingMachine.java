package Practice;
import java.util.*;

public class VendingMachine {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter cents:");
                int cents= scan.nextInt();
                if(cents<100 &&cents>0){
                    int quarters = cents/25;
                    int dimes= cents%25/10;
                    int nickels=(cents%25/10)/5;
                    int pennies = ((cents%25%10%5))/1;

                    System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, "+nickels+" nickels, and "+pennies+" pennies");

                }else {
                    System.out.println("Invalid cents amount");
                }






            }
        }
