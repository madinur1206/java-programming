package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
        String carModel = "Ford Escape";
        String driverName = "Madinur";
        int licenceNum = 487316;
        short speed = 100;
        boolean isAutomatic = true;
        char licenseClass = 'A';

        System.out.println(carModel +" is car model.");
        System.out.println(driverName+ " is driving the car." );
        System.out.println(driverName +"is driving "+carModel );
        System.out.println(licenceNum  );
        System.out.println("Current speed is: " +speed+" mph");
        System.out.println("Is car automatic? " +isAutomatic  );
        System.out.println(licenseClass+" "+isAutomatic );


    }
}
