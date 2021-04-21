package Practice;

public class LoopEvenNumbers {
    public static void main(String[] args) {
        int number=80;
        int sum=0;
        while(number<=100){
            if(number%2==0){
                sum+=number ;
            }

        }
        System.out.println("sum = " + sum);

    }
}
