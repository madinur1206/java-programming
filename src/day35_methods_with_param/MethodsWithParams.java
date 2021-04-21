package day35_methods_with_param;

public class MethodsWithParams {
    public static void main(String[] args) {
        displayValue(5);
        displayValue(15);
        displayValue(56);
        int count = 55;
        displayValue(count);
        greetByName("Elshat");
        greetByName("ayjamal and mahmut");



    }
    public static void displayValue(int num){
        System.out.println("num = " + num);

    }
    public static void greetByName(String name){
        System.out.println("hello " + name +",how are you today?  I love you muaaaaaa");
    }
}
