package day38_methods;
//import all static methods,sop that you can just call by method name,without class name.
import static day38_methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String userName= "";
     if (StringUtils.isNullOrEmpty(userName ) ){
         System.out.println("Fail : User name can not be empty or null");
         System.out.println(isPalidrome("civic") );
         System.out.println(isPalidrome("elshat") );
         String word= "java";
         String revword= StringUtils.reverse(word) ;
         System.out.println("word = " + word);
         System.out.println("revword = " + revword);


     }
    }
    public static  boolean  isPalidrome (String str){
        str= str.toLowerCase() ;
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i ) ){
                return false;
            }

        }
        return true;
    }
}
