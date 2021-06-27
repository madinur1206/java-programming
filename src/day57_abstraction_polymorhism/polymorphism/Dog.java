package day57_abstraction_polymorhism.polymorphism;

public class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Dog is saying and barking gav gav woof woof");
    }
}
