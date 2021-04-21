package day19_class_vs_0bject_string;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "usa";
        if(countryCode.equals(countryCode .toUpperCase() ) ){
            System.out.println("pass- case is correct");
        }else{
            System.out.println("Fail- case is incorrect");
            String word = "JAVA";
            String uWord = word.toUpperCase() ;
            if (word.equals(uWord )){
                System.out.println("case match");
            }else {
                System.out.println("case does not match");
            }
        }
    }
}
