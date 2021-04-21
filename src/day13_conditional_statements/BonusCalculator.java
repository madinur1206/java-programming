package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double salesAmount = 789.99;
        double bonus = 0.0;
        if (salesAmount <= 1000) {
            bonus = 50.0;
            System.out.println("Good job,you qualified for bonus");
        } else {
            bonus = 100.0;
            System.out.println("Great job, you qualified for full bonus");
        }
        System.out.println("Your Bonus for $" + salesAmount + " is $" + bonus);
    }
}
