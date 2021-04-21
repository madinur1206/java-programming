package day18_conditions_practice_string_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String carBrand = "Mercedes";
        String model = "A" ;
        double leasePrice = 0.0;
        if(carBrand .equals("Mercedes")){
            if(model.equals("E")){
                leasePrice = 500.0;
            }else if(model.equals("A")){
                leasePrice = 400.0;
            }else{
                System.out.println("Invalid Entry");

                    }
            System.out.println("Brand :" + carBrand );
            System.out.println("Car model:" + model );
            System.out.println("leasePrice = " + leasePrice);
                }
            }
        }


