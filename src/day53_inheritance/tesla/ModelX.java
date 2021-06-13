package day53_inheritance.tesla;

public class ModelX  extends ElectricCar {
    public ModelX(String model, double price, int year, int range) {
        super("Tesla", model, price, year, range);
    }
    //public void charge () {
      //  Error because   charge is   final methos. can  not be overridden.
   // }
}
