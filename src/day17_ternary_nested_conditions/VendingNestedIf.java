package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection= "drink";
        String drinkItem = "coke";
        String snakeItem = "chips";
        if(selection.equals("drink")){
            System.out.println("drink option is selected");
            if(drinkItem .equals("tea")){
                System.out.println("tea is selected");
            }else{
                System.out.println("coke is selected");
            }
        }else if(selection .equals("snack")){
            System.out.println("snack option is selected");
            if(snakeItem .equals("chips")){
                System.out.println("chips item is selected");
            }else{
                System.out.println("candy option is selected");
            }
        }
    }
}
