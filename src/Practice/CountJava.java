package Practice;
import java.util.Scanner;
public class CountJava {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();
        int numberOfJava= 0;
        for (int i = 0; i <word.length()-3 ; i++) {
            if(word.substring(i,i+4).equals("java") ){
                numberOfJava ++;
            }


        }
        System.out.println(numberOfJava );

    }
}
