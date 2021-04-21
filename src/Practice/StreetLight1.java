package Practice;

public class StreetLight1 {
    public static void main(String[] args) {
        String streetLight = "Yellow light";
        switch(streetLight ){
            case "Green light":
                System.out.println("Go");
                break;
            case "Yellow light":
                System.out.println("Slow down");
                break;
            case "Red light":
                System.out.println("Stop");
        }
    }
}
