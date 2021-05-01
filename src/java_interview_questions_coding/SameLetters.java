package java_interview_questions_coding;
import java.util.*;

public class SameLetters {
    public static void main(String[] args) {
        String a= "abc";
        String b= "cab";
        System.out.println(same(a,b) );


    }
    public static boolean same(String a,String b){
        char [] ch1 = a.toCharArray() ;
        char [] ch2 = b.toCharArray() ;
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1= "";
        String b1= "";
        for (char each:ch1){
            a1+=each ;
        }
        for (char each:ch2){
            b1+=each ;
        }
        return a1.equals(b1) ;
    }
}
