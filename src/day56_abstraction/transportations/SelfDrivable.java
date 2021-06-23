package day56_abstraction.transportations;

public interface SelfDrivable {
    void autoDriving();
    public default void selfPark () {
        // void selfPark (); will show error in sub classes. becuse they must override abstract methods.
        //if we add default method it will easier to add functionality for some
        //classes without breaking other implementation.
        System.out.println("performing self park steps");
    }
}
