package day46_encapsulation;

public class CarDealership {
    public static void main(String[] args) {
        Car car1= new Car ();
       // car1.model= "Nissan Altima"; __> error ,model is private ,it can't be access in different class;
        car1.setModel("Nissan Altima") ;
        System.out.println(car1.getModel());
        car1.setYear(2019) ;
        System.out.println(car1.getYear() );
        car1.setMileage(45230) ;
        System.out.println("car1 mileage= "+ car1.getMileage() );
        System.out.println(car1.toString() );
        System.out.println(car1);//automatically calls toString method

        Car alfaRomeo= new Car();
        alfaRomeo .setModel("guilia") ;
        alfaRomeo .setYear(2017) ;
        alfaRomeo .setMileage(16690) ;
        System.out.println("model = "+alfaRomeo .getModel() );
        System.out.println("Year =  "+alfaRomeo .getYear() );
        System.out.println("Mileage = "+alfaRomeo .getMileage() );
        System.out.println(alfaRomeo );
    }
}
