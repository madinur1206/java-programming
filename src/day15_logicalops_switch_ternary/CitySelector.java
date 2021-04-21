package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {

        String city ="ottawa";

        if(city.equals("hawaii") || city.equals("Tokyo")){

            System.out.println("I will move to " +city );
        }else{
            System.out.println("Not considering -" +city );
        }
        String teacher ="Murodil";
        if (teacher .equals("saim") || teacher .equals("Murodil")){
            System.out.println("It is java class with " + teacher );
        }else if(teacher .equals("Nadir")){
            System.out.println("soft skill class  with " + teacher);
        }else{
            System.out.println("Some class with " + teacher );
        }
        String company = "Amazon";
        double salary = 100000.00;
        if(company.equals("Amazon") || salary==100000.00){
            System.out.println("I will accept the offer from " + company);
        }else{
            System.out.println("Rejecting offer from " + company);
        }
    }
}
