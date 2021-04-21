package day36_methods_with_return;
import java .util.*;

public class Info {
    public static void main(String[] args) {
        System.out.println("Full name= "+fullName());
        System.out.println( "Is Married = " +isMarried ());
        System.out.println("Age =" + getAge());
        System.out.println("Random Year ="+ getRandomYear ());
        System.out.println("Birth Year="+ getRandomYear ());
        String  name = fullName();
        boolean married = isMarried() ;
        int age = getAge() ;
        int year= getRandomYear() ;

        System.out.println("year = " + year);
        System.out.println("name = " + name );
        System.out.println("married = " + married );
        System.out.println("Age = " + age );
        if(isMarried() ){
            System.out.println("married");
        }else{
            System.out.println("single");
        }

    }
    public static String fullName(){
        System.out.println("inside full name ");
        return "Madinur Mahmud";
    }
    public static boolean isMarried (){
        return false;
    }
    public static int getAge() {
        int age = 18;
        return age ;
    }
    public static int getRandomYear (){
        Random random = new Random();
        int randomYear = random .nextInt(2021);
        return randomYear ;
    }
}
