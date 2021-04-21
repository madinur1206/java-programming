package day38_methods;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(isNullOrEmpty("hello") );
        String word = null;

        System.out.println(isNullOrEmpty(word) );
        word = "";
        System.out.println(isNullOrEmpty(word) );
    }
    public static boolean  isNullOrEmpty(String str){
        return  (str==null || str.isEmpty() );

        }
        public static String reverse(String str){
        String reversed= "";
            for (int i = str.length()-1 ; i>=0 ; i--) {
               reversed+=str.charAt(i) ;


            }
            return reversed ;
        }
    }

