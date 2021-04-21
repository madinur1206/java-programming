package day37_methods_overloading;
import java .util.*;
public class OverLoadMain {
    public static void main(String[] args) {
        System.out.println("Hello From Real main method");
        main(1,2) ;
        System.out.println(Arrays.toString(args));

    }
    public static void main(int num1,int num2){
        System.out.println(num1 +num2);
    }
}
