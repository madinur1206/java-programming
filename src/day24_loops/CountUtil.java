package day24_loops;
import java.util.*;

public class CountUtil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int numberToStop = scan.nextInt() ;
        int start = 1;
        while(start<=numberToStop ){
            System.out.println(start +"");
            start++;
        }

    }
}
