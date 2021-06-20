package day55_abstraction.interfaces_demo;

public interface MyInterface {
    public abstract void learn ();

}
interface MyInterface2 {

        }

class MyClass implements  MyInterface,MyInterface2 {

    @Override
    public void learn() {
        System.out.println("Learning in my class");

    }
}
class Main {
    public static void main(String[] args) {
      //  MyInterface myInterface = new MyInterface(); error

      MyClass myClass = new MyClass() ;
    }
}
