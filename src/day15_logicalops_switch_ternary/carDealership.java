package day15_logicalops_switch_ternary;

public class carDealership {
    public static void main(String[] args) {
        double budget= 5000.00;
        String model = "Tesla";
        double carPrice = 7890.00;
        if(carPrice <= budget &&(model.equals("Toyota")||model.equals("Honda")||model.equals("Tesla"))){
            System.out.println("I would like to buy "+ model + " at this "+ carPrice );
        }else{
            System.out.println("I'm not gonna buy " + model+ " at this " + carPrice );
        }
    }
}
