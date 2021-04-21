package Practice;

public class OperatorPractice2 {
    public static void main(String[] args){
       int numOne =10;
       int numTwo= numOne++ *3+ ++numOne +numOne++ %2;
       int biggest = numOne >numTwo ?numOne :numTwo ;
        System.out.println("biggest = " + biggest);
        System.out.println("numOne = " + numOne );
        System.out.println("numTwo ="+ numTwo );
    }
}
