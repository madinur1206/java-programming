package day56_abstraction.transportations;

public abstract  class Transportation {
    public abstract void transportPeople();
    public abstract void cost(int mile);
    public void start () {
        System.out.println("starting the engine");
    }
    public void stop () {
        System.out.println("Shut off the engine");
    }
}
