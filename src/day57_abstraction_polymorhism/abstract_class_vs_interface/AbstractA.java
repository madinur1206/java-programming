package day57_abstraction_polymorhism.abstract_class_vs_interface;

public  abstract class AbstractA {
 public static final  String TYPE = "interface";
    // abstract class can have all kinds of variable.
    int num1;
    private double price;
   protected static int count; //in abstract class,all access modifier work for instance,static ,all variable
    public final String TYPE1 = "abstract";
    public static final String  language = "java";

    // abstract method can have abstract , static or non _anstract method
   // private abstract void absMethodA();-- abstract method can not be private,static or final.
    public abstract void absMethodA();
    public void methodB () {
        System.out.println("Method B called");
    }
    public static void staticMethodC () {
        System.out.println("Static method is called");
    }
    public AbstractA () {
        System.out.println("abstract class can have constructor");
    }
}
