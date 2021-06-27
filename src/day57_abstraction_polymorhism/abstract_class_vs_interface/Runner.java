package day57_abstraction_polymorhism.abstract_class_vs_interface;

public class Runner {
    public static void main(String[] args) {
       // AbstractA  abstractA = new AbstractA(); we cannot create object (instantiate)of abstract class
       // InterfaceA interfaceA = new InterfaceA() ;we cannot create object (instantiate)of interfaces
InterfaceA.staticMethodE("madinur");
//ConcreteA.staticMethodE("Elshat"); // Error only can be called interfaces.

    }
}
