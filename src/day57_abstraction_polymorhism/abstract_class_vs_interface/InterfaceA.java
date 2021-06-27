package day57_abstraction_polymorhism.abstract_class_vs_interface;

public interface InterfaceA {
// interface can only have public static final variables. it also called constance

    public static final  String TYPE = "interface";
   // protected static final  String TYPE1 = "interface";
   // everything has to be public
    double MAX_COUNT= 500;// this is also automatically public static final, we have to assign value.
    public abstract void absMethodD (int num);


    /**
     * Starting from java 8
     * Interface can have : 1. Abstract methods
     * 2. Static methods
     * 3. Default methods
     */

    public static void staticMethodE(String str) {

        System.out.println("staticMethodE is called");
    }
// default method is a method with a body in the interface
    public default void defaultMethodF () {
        System.out.println("DefaultMethodF is called ");
    }
    //Interfaces cannot have constructor
   // public InterfaceA () {
      //  System.out.println("Constructor is not welcome in Interface");
   // }

}
