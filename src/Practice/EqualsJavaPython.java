package Practice;
import java.util.Scanner;
public class EqualsJavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String sentence = scan.nextLine() ;
        int numberOfJava= 0;
        int numberOfPython= 0;
        for (int i = 0; i <sentence .length()-3 ; i++) {
            if(sentence .substring(i ,i+4).equals("java") ){
                numberOfJava ++;
            }
        }
        for (int i = 0; i <sentence .length() -5; i++) {
            if(sentence .substring(i ,i+6).equals("python") ){
                numberOfPython ++;
            }

        }
        System.out.println(numberOfJava ==numberOfPython );

    }
}
