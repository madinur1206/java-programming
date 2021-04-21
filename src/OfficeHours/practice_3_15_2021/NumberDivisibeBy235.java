package OfficeHours.practice_3_15_2021;
/*
[Boolean expressions, operators]

Create a program that will accept a number and it will print if it is evenly divisible by 2, 3, and 5

Ex:
number = 65

Output:
65 is divisible by 2: false
65 is divisible by 3: false
65 is divisible by 5: true

 */

public class NumberDivisibeBy235 {

    public static void main(String[] args) {
        int number =65;
        boolean by2 = number%2==0;
        boolean by3= number% 3==0;
        boolean by5 = number%5==0;
        System.out.println( number+"is visible by 2 " + by2 );

    }
}
