package Practice;
import java.util.Scanner;
public class CountTriple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        for (int i = 0; i <str.length()-2 ; i++) {
            if(str.substring(i,i+2).equals(str.substring(i+1,i+3) ) ){
                count++;
            }

        }
        System.out.println(count );

    }
}
