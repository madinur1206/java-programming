package day45_opp;

public class TrafficLightObjects {
    public static void main(String[] args) {
        //create traffic light object
        TrafficLight trafficLight = new TrafficLight() ;
        trafficLight .changeColor("red") ;
        trafficLight .showColor() ;
        trafficLight .changeColor("green") ;
        trafficLight .showColor() ;
        TrafficLight trafficLight2= new TrafficLight() ;
        trafficLight2 .changeColor("black") ;
        trafficLight2 .showColor() ;
    }
}
