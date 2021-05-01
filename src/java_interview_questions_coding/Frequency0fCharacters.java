package java_interview_questions_coding;
import java.util.*;

public class Frequency0fCharacters {
    public static void main(String[] args) {
  String str= "AAABBCDD";
        System.out.println(FrequencyOfChars(str) );



    }
public static String FrequencyOfChars(String str){
        int j= 0;

    String expectedStr= "";
        while(j<str.length() ){
            int count= 0;
            for (int i = 0; i <str.length() ; i++) {
                if (str.charAt(i)==str.charAt(j) ){
                    count++;
                }
            }
          expectedStr += ""+str.charAt(j)+ count;
            str= str.replace(""+str.charAt(j) ,"") ;
        }
        return expectedStr ;
}

}
