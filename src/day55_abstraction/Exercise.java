package day55_abstraction;

public abstract  class Exercise {
    public void start() { //non -abstract method.// sub class can use it as it like or can override.
        System.out.println("Warming up and starting the exercise");
    }
    // abstract method - method without body/implementation ,just signature.
    //purpose is let subclasses implement/override their own way.
    public abstract void perform ();
    //another abstract method that concrete sub classes will override/implement
    //param -minutes how long exercise is performed
    //int return type
    public abstract int getCaloriesCount(int minutes);

}
