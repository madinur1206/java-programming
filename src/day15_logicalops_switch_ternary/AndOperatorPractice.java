package day15_logicalops_switch_ternary;
/*
main method

onSale, freeShipping
itemName

use if statement with && , to check if you would add item in cart.
You do not have permission to send messages in this channel.

 */

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping =true;
        String itemName = "Wooden Spoon";
        if(onSale&& freeShipping ){
            System.out.println("Adding to cart " +itemName ) ;
        }else{
            System.out.println("Adding to cart " +itemName +itemName );
        }
        if(freeShipping &&onSale &&itemName.equals("Wooden Spoon")){
            System.out.println("Adding to cart " +itemName);
        }else{
            System.out.println("Continue shopping for good deals on " +itemName);
        }
    }
}
