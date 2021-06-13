package day53_inheritance.hiding;

public class Mobile extends Phone {
    String type = "Mobile phone";
    // this is method hiding,we are hiding use() static method
    public static void use () {
        System.out.println("Using mobile phone");
    }

    public void text () {
        use() ;
        System.out.println("sending a text message");
    }
}
