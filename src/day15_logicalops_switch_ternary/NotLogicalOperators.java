package day15_logicalops_switch_ternary;

public class NotLogicalOperators {
    public static void main(String[] args) {
        System.out.println("!true = "+(!true));
        System.out.println("!false = "+(!false));
        int age = 2;
        if(!(age>7)){
            System.out.println("Need to sit in  child car seat  age = " +age);
        }else{
            System.out.println("Can sit in normal seat. age = " + age);
        }
        boolean isSmokingAllowed =false;
        if(!isSmokingAllowed ){
            System.out.println("Smoking is not allowed here.Exit");
        }
        boolean isAffordable = true;
        if(!isAffordable ){
            System.out.println("Item not affordable");
        }
        String env = "qa";
        if(!env.equals("qa")){
            System.out.println("In wrong enviroment for QA testing");
        }
        String carModel ="Tesla";
        if(!carModel .equals("Tesla")){
            System.out.println("Not interested, Thank you!");
        }
        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if(!inputPassword.equals("abc123")){
            System.out.println("incorrect password");
        }
    }
}
