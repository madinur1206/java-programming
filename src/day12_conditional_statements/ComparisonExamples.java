package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 45;
        int speedLimit= 55;
        boolean isSpeeding= currentSpeed >speedLimit ;
        System.out.println("Are you speeding? -" +isSpeeding ) ;
        System.out.println("current speed = " + currentSpeed );
        System.out.println("speed limit = " + speedLimit );

        currentSpeed +=20;//65
        isSpeeding =currentSpeed >speedLimit ;
        System.out.println("Are you speeding? -" +isSpeeding ) ;
        System.out.println("current speed = " + currentSpeed );
        System.out.println("speed limit = " + speedLimit );

        double accountBalance = 250.25;
        double itemPrice = 200.99;
        System.out.println("can I afford? -"  +(accountBalance >=itemPrice) );//true

        boolean canAfford = accountBalance>=itemPrice ;
        System.out.println("Can I afford? -  " + canAfford);
        accountBalance = accountBalance -itemPrice ;
        accountBalance -=itemPrice ;
        boolean isBroke = accountBalance <=0;
        System.out.println("Am I broke? -" +isBroke );



    }
}
