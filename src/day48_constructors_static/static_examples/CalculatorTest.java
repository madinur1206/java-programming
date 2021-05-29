package day48_constructors_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {
        // static method
        Calculator.add(5,3) ;// add is static method, can be called using Classname.staticMethodName;

        // instance /object method
        //Calculator.multiply(2,4);// Error  multiply is not static method so we need to create new object
        Calculator calculatorObject = new Calculator ();
        calculatorObject .multiply(2,4) ;
        // static method can also be called using an object

        calculatorObject .add(5,3);

    }
}
