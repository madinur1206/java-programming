import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12,14,2,6,89);
        System.out.println("nums = "+ nums);
        //nums.add(100);
        //nums.remove(0) ;
       // nums.clear()
        List<Integer> numsList = new ArrayList<>(Arrays.asList(4,2,5,6,7,9) );
        numsList.add(33) ;
        numsList.add(56) ;
        System.out.println("numsList = "+numsList );
        numsList .remove(0) ;
        numsList .remove(new Integer(5)) ;
        System.out.println("numsList = "+numsList );
        List<String >drinksWithCaffeine= new ArrayList<>(Arrays.asList("coffee","tea","monster","red bull","coke","pepsi","mildew","kambucha","celsius") );

        System.out.println(drinksWithCaffeine );
        int caffeinAmount= 0;
        for(String eachDrink:drinksWithCaffeine ){
            if(eachDrink .equals("monster") ||eachDrink .equals("red bull")||eachDrink .equals("celsius")){
                caffeinAmount = 150;
                System.out.println(eachDrink +"---"+ caffeinAmount );
            }else if(eachDrink .equals("coffee") ||eachDrink .equals("kambucha")){
                caffeinAmount =112;
                System.out.println(eachDrink +"---"+ caffeinAmount );
            }else if(eachDrink .equals("tea") ||eachDrink .equals("coke")||eachDrink .equals("pepsi")||eachDrink .equals("mildew")){
                caffeinAmount = 35;
                System.out.println(eachDrink +"---"+ caffeinAmount );

            }

        }
        System.out.println("--------------------------");
        for (String eachDrink :drinksWithCaffeine ){
            switch(eachDrink ){
                case "monster": case "red bull": case "celsius":
                    caffeinAmount = 150;
                    System.out.println(eachDrink +"---"+ caffeinAmount );
                    break;

                case "coffee": case "kambucha":
                    caffeinAmount =112;
                    System.out.println(eachDrink +"---"+ caffeinAmount );
                    break;

                case "tea": case "coke": case "pepsi": case "mildew":
                    caffeinAmount = 35;
                    System.out.println(eachDrink +"---"+ caffeinAmount );
                    break;

            }
        }
        drinksWithCaffeine .forEach(eachDrink-> System.out.print(eachDrink.toUpperCase()+" " )) ;
        drinksWithCaffeine .forEach(eachDrink->{
            System.out.println("-------------------------------------------");
            System.out.println("eachDrink = " + eachDrink);
            System.out.println("--------------------------------------------");

        }) ;

        }
    }

