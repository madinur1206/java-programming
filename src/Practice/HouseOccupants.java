package Practice;

public class HouseOccupants {
    public static void main(String[] args) {
        String houseType = "Villa";
        int maxOccupants= 0;
        switch(houseType ){
            case "Tree house":
                maxOccupants =1;
                System.out.println("maxOccupants = " + maxOccupants);
                break;
            case "Mobile home":
                maxOccupants =2;
                System.out.println("maxOccupants = " + maxOccupants);
                break;
            case "Apartment":
                maxOccupants =4;
                System.out.println("maxOccupants = " + maxOccupants);
                break;
            case "Town house":
                maxOccupants = 6;
                System.out.println("maxOccupants = " + maxOccupants);
                break;
            case "Villa":
                maxOccupants =8;
                System.out.println("maxOccupants = " + maxOccupants);
                break;
            case "Mansion":
                maxOccupants =10;
                System.out.println("maxOccupants = " + maxOccupants);
                break;
            default :
                System.out.println("Invalid entry");
                break;
        }
    }
}
