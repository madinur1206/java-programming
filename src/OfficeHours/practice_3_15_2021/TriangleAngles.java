package OfficeHours.practice_3_15_2021;
/*
[Triangle - If statement, operators]

A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write a program that declares three integers as angles and check whether the triangle is valid or not. Print "Valid triangle" or "Not a valid triangle".

    => To make it dynamic change the three angles to be Scanner inputs


 */

public class TriangleAngles {
    public static void main(String[] args) {
        int angleOne =100;
        int angleTwo= 30;
        int angleThree= 50;
        /*int sum = angleOne +angleTwo +angleThree ;
        if(sum==180){
            System.out.println("valid triangle");
        }else{
            System.out.println("Invalid triangle");
        }

         */
        boolean check=(angleOne + angleTwo + angleThree )==180;
        if(check){
            System.out.println("valid triangle");
        }else{
            System.out.println("Invalid triangle");
        }


    }
}
