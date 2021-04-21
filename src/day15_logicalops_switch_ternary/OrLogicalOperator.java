package day15_logicalops_switch_ternary;

public class OrLogicalOperator {
    public static void main(String[] args) {
        System.out.println("true||true=" + (true || true));
        System.out.println("true||false=" + (true || false));
        System.out.println("false||true=" +(false||true));
        System.out.println("false||false=" +(false||false));
        int apples = 5;
        int oranges =7;
        System.out.println(apples>3 ||oranges >4);
        if(apples>3 ||oranges >4){
            System.out.println("No need to buy any fruits today");
        }else{
            System.out.println("Need to get some fruit");
        }
        System.out.println(apples>2 ||oranges >10);
        if(apples>2 ||oranges >10){
            System.out.println("looks like we are good with fruits");
        }else{
            System.out.println("need to buy some fruit");
        }
        System.out.println(apples==0 ||oranges ==0);
        if(apples==0 ||oranges ==0){
            System.out.println("We need to purchase some fruits");
        }else{
            System.out.println("we are good with fruits");
        }
    }
}
