package day57_abstraction_polymorhism.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalTests {
    public static void main(String[] args) {
        Animal a1 = new Animal() ;// not polymorphic, data type and object type is same.
        a1.makeNoise() ;
        //polymorphism
        Animal animal1= new Dog() ;
        Animal animal2= new Horse() ;
        Animal animal3= new Cat() ;
        //List list= new ArrayList();
        animal1 .makeNoise() ;
        animal2 .makeNoise() ;
        animal3 .makeNoise() ;
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals .add(new Dog()) ;
        listOfAnimals .add(new Horse() ) ;
        listOfAnimals .add (new Cat());
        for (Animal each :listOfAnimals ) {
           each.makeNoise() ;
        }

    }
}
