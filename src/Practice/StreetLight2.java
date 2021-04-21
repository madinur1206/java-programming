package Practice;
/*
[Street light]

You are at a street line. The color of the street line will determine what you should do.

    Green light - Print "Go"
    Yellow light - Print "Slow down"
    Red light - Print "Stop"

 */
public class StreetLight2 {
    public static void main(String[] args) {
        String streetLight = "Red light";
        if(streetLight.equals("Green light" )){
            System.out.println("Go");
        }else if (streetLight.equals("Yellow light" )){
            System.out.println("Slow down");
        }else if(streetLight.equals("Red light" )){
            System.out.println("Stop");
        }
    }
}
