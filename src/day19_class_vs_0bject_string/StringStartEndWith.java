package day19_class_vs_0bject_string;

public class StringStartEndWith {
    public static void main(String[] args) {
        String word = "madinur";
        System.out.println(word.startsWith("madinur"));
        System.out.println(word.startsWith("r") );
        System.out.println(word.startsWith("M") );
        System.out.println("madinur".startsWith("m") );
        System.out.println(word.endsWith("r") );
        System.out.println("madinur".endsWith("m") );
        System.out.println(word.endsWith("madinur") );

        String firstName = "Ms. Madinur";
        if(firstName .startsWith("Mr.") ){
            System.out.println("Man");
        }else if(firstName .startsWith("Dr.")){
            System.out.println("Doctor");
        }else if(firstName .startsWith("Mrs.")){
            System.out.println("Married woman");
        }else if(firstName .startsWith("Ms. ")){
            System.out.println("Single woman");
        } else if(firstName .startsWith("Sr.")){
            System.out.println("Senior");
        }else{
            System.out.println("Normal name");
        }
    }
}
