package day57_abstraction_polymorhism.abstract_class_vs_interface;

public class ConcreteA extends AbstractA implements InterfaceA ,InterfaceB {
    @Override
    public void absMethodA() {
        System.out.println("absMethodA implementation is called");
    }
    //extending : class can extend one abstract class, class can implement one
    //multiple interfaces

    // first non-abstract child class of abstract class or interface is called concrete class.
    // if there is another non abstract class called B,B extends concrete A, B is not concrete.
@Override
    public void methodB () {
    System.out.println("Method B overridden version is called");
}

//@Override static method can not be overridden, are hidden.
    public static void staticMethodC () {
    System.out.println("staticMethodC hidden version is called");
}

    @Override
    public void absMethodD(int num) {
        System.out.println("absMethodD overridden version is called");
    }
}
