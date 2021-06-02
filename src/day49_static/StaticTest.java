package day49_static;

public class StaticTest {
    String word= "java";
    static String word1= "java";
    public static void main(String[] args) {
        //1. static method can be called using class name
        StaticMethods.displayMessage("wooden spoon") ;
        //1.instance methods needs an object to be called
        //StaticMethods.instanceMethod(); error
        StaticMethods stm= new StaticMethods() ;
        stm.instanceMethod() ;
        //2. static method can only access other static variables and methods
       // System.out.println(word);// Error static method only access static variable
        System.out.println(word1);
    }
}
