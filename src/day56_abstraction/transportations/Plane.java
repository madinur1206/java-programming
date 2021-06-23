package day56_abstraction.transportations;

import day56_abstraction.Greeting;

public class Plane extends Transportation implements SelfDrivable , Greeting  {

    @Override
    public void hi() {
        System.out.println("plane is saying hi hi woo woo");
    }

    @Override
    public void bye() {
        System.out.println("bye bye  we are landing ");

    }

    @Override
    public void autoDriving() {
        System.out.println(" plane has auto pilot mode");

    }

    @Override
    public void transportPeople() {
        System.out.println("plane can transport people");

    }

    @Override
    public void cost(int mile) {
        System.out.println("tesla costes "+ (mile*25.0) +" to drive "+mile + "miles");

    }

    public void land() {
    }
}
