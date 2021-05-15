package day45_opp;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee myCoffee= new Coffee() ;
        System.out.println("coffee amount = " + myCoffee.getAmount());
        myCoffee .refill() ;
        System.out.println("amount after refill " +myCoffee .getAmount() );
        myCoffee .drink(10) ;
        System.out.println("amount after drink 10 = "+ myCoffee.getAmount());
        myCoffee .setType("Turkish coffee") ;
        System.out.println("My coffee = " + myCoffee .getType() ) ;
        System.out.println(myCoffee .toString() );
        Coffee coffee1 = new Coffee() ;
        coffee1 .setType("cappuccino") ;
        System.out.println("coffee1 type = "+ coffee1 .getType() );
        // hey java ,point coffee 2 same as coffee1
        Coffee coffee2 = coffee1 ;
        System.out.println("coffee 2 type = "+ coffee2.getType() );
        coffee2 .setType("Espresso") ;
        System.out.println(coffee2 .getType() );
        Coffee coffee3 = new Coffee() ;
        coffee3 .setType("Frappucino");
        System.out.println(coffee3 .getType() );
        coffee3 = coffee2 ;
        System.out.println(coffee3 .getType() );
        //Coffee coffee4= null;  null point exception;
        //coffee4.setType("Turkish") ;

    }
}
