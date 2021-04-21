package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("The sum is ="+add(4.6,3.2) );
        System.out.println("The difference is "+ minus(4.6,3.2) );
        System.out.println("The multiplication is "+ multiply(4.6,3.2) );
        double division1= divide(4.6,3.2);
        System.out.println("The division is "+ division1  );


    }
    public static double add(double num1,double num2) {
        double sum = num1+num2;
        return sum;
    }
    public static double minus(double num1,double num2){
        double subtract= num1 -num2;
        return subtract ;
    }
    public static double multiply  (double num1,double num2){
        double multiplication= num1*num2;
        return multiplication ;
    }
    public static double divide  (double num1,double num2){
        double division= num1/num2;
        return division ;
    }
}
