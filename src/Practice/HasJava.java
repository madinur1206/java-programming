package Practice;
import java. util.Scanner;

public class HasJava {
    public static void main(String[] args) {

        Scanner scan= new Scanner (System.in);
        String word = scan.next();
        int  first = word.indexOf("java");
        int  next = word.indexOf("java");
        if(first==0||next==1){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
