package day13_conditional_statements;

public class IfWithBooleanVariables {
    public static void main(String[] args) {
        boolean isHungry = true;
        if (isHungry) {
            System.out.println("I am hungry I will go get something to eat\nThen code Java");
        } else {
            System.out.println("I am not hungry, let's keep coding");

        }
        double price =189.99;
        boolean isAffordable= 200.00 >=price;
        if(isAffordable){
            System.out.println("Is affordable =" +isAffordable );
        }else{
            System.out.println("Too expensive , let's KEEP CODING JAVA");
        }
        boolean isRemoteJob = true;
        if(!isRemoteJob){
            System.out.println("Sorry I am not interested");

        }else {
            System.out.println("Sure I am interested, what is the interview process?");
        }
    }
}
