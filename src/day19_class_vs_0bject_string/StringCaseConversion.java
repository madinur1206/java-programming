package day19_class_vs_0bject_string;

public class StringCaseConversion {
    public static void main(String[] args) {

        String word = "CyberTek";
        System.out.println(word.toLowerCase() );
        System.out.println(word.toUpperCase() );
        word = word.toLowerCase() ;
        System.out.println(word );
        word = word.toUpperCase() ;
        System.out.println(word);
        String company= "Amazon";
        System.out.println(company.toUpperCase() );
        System.out.println("company in uppercase = " +company.toUpperCase() );
        System.out.println("java".toUpperCase() );
        System.out.println("company = " + company);
        company =company.toUpperCase();
        System.out.println(company);
    }
}
