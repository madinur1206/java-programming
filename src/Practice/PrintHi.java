package Practice;
import java.util.Scanner;
public class PrintHi {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String str = scan.nextLine() ;
        int numberOfHi= 0;

        for (int i = 0; i < str.length() -1; i++) {
            if(str.substring(i,i+2) .equals("hi") ){
                numberOfHi ++;
            }


        }
        System.out.println(numberOfHi );
    }
}
