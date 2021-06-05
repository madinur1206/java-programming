package day50_inheritance;

import sun.util.resources.cldr.to.CalendarData_to_TO;

public class AnimalObjects {
    public static void main(String[] args) {

        Animal animal = new Animal() ;
        animal.name= "Gray";
        animal.type= "pitbull";
        animal.speak();

        Cat cat = new Cat();
        cat.speak() ;

        Dog dog= new Dog() ;
        dog.speak() ;
    }
}
