package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        System.out.println("Even numbers:");

        for(int num=1;num<=100;num++) {
            if(num%2==0){
                System.out.print(num+" ");
            }

            }
        System.out.println("\nOdd numbers :");
        for(int num=1; num<=100; num++) {
            if(num%2 !=0){
                System.out.print(num+ " ");
            }
        }
        }
    }

