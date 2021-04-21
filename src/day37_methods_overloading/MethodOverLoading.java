package day37_methods_overloading;

public class MethodOverLoading {
    public static void main(String[] args) {
        MethodOverLoading .sum(10,5);
        sum(2.3,4.3) ;
        sum(10,2.3) ;
        sum("Hello","world");
        sum((int)4.2,3,2 );


    }

//
//    }
//    public static int sum (int num1,int num2){
//        return num1+num2;
//
//    }
//    public static double sum(double num1,double num2){
//        return num1+num2;
//    }
//    public static void sum(int num1,int num2,int num3) {
//
//    }
//    public static String  sum(String word1, String word2){
//        return "word1"+"word2 ";
//    }

            public static void sum(int num1, int num2) {
                System.out.println("sum(int , int )");
                System.out.println("Result = " + (num1 + num2));
            }

            public static void sum(int num1, int num2, int num3) {
                System.out.println("sum(int , int , int )");
                System.out.println("Result = " + (num1 + num2 + num3));
            }

            public static void sum(double num1, double num2) {
                System.out.println("sum(double, double)");
                System.out.println("Result = " + (num1 + num2));
            }

            public static void sum(String str1, String str2) {
                System.out.println("sum(string, string)");
                System.out.println("Result = " + (str1 + str2));
            }
}
