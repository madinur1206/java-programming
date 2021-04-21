package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "ottawa";
        int  salary = 100000;
        boolean isRemote = true;
        boolean hasBenefits= true;
        if(location.equals("ottawa")&&salary==100000&&isRemote &&hasBenefits ){
            System.out.println("I will accept job offer");
        }else{
            System.out.println("I will look for another job" );
        }
    }
}
