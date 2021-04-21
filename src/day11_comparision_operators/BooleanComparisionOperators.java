package day11_comparision_operators;

public class BooleanComparisionOperators {
    public static void main(String[] args) {
        System.out.println(10==10);//true
        System.out.println(1000>100);//true
        System.out.println(985.44<98547.5);//true
        System.out.println(10<=11);//true
        System.out.println(5>=3);//true
        System.out.println(-100!=44);//true

        int a =100;
        int b = 200;
        System.out.println(a==b);//false
        System.out.println(a>b);//false
        System.out.println(a<b);//true
        System.out.println(a>=b);//false
        System.out.println(a<=b);//true
        System.out.println(a!=b);//true
        
        boolean result;
        result= 5==5;
        System.out.println("result = " + result);


        result = 33> 44;
        System.out.println("result = " + result);
        
        result = 88<99;
        System.out.println("result = " + result);
        result = 10>=10;
        System.out.println("result = " + result);
        result = 123<=124;

        String city = "seattle";
        System.out.println( city =="seattle");
        System.out.println(city =="Baku");

        String name = "Nadir";
        boolean checkName = name=="Nadir";
        System.out.println("checkName = " + checkName);
        checkName = name!="kuzzat";



        

    }
}
