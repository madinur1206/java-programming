package day56_abstraction.transportations;

import day56_abstraction.Greeting;

public class Tesla extends Transportation  implements SelfDrivable, Greeting  {
    @Override
    public void transportPeople() {
        System.out.println("Tesla is transporting people on the roads");
    }

    @Override
    public void cost(int mile) {
        System.out.println("tesla costes "+ (mile*0.10) +" to drive "+mile + "miles");

    }

    @Override
    public void autoDriving() {
        System.out.println("Tesla can auto drive");
    }

    @Override
    public void hi() {
        System.out.println("Tesla is saying hello hello  peep peep");

    }

    @Override
    public void bye() {
        System.out.println("Bye bye charge me charge me");

    }
}
