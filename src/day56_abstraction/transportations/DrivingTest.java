package day56_abstraction.transportations;

public class DrivingTest {
    public static void main(String[] args) {
        Tesla model3 = new Tesla();
        model3.hi() ;
        model3 .cost(25);
        model3 .autoDriving() ;
        model3 .start() ;
        model3 .stop() ;
        model3 .transportPeople() ;
        model3.bye() ;

        Plane plane= new Plane();
        plane.hi() ;
        plane.cost(25) ;
        plane.land();
        plane.start() ;
        plane.stop() ;
        plane.transportPeople() ;
        plane.bye() ;
        SelfDrivable  sd = new Plane() ;
        SelfDrivable sd2 = new Tesla() ;

        Transportation tp1 = new Plane() ;
        Transportation  tp2 = new Tesla() ;

    }
}
