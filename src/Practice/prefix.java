package Practice;
import java.util.Scanner;
public class prefix {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String str = scan.next();
        int n = scan.nextInt();
        String prefix= str.substring(0,n);
        if(str.substring(1).contains(prefix ) ){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
}
