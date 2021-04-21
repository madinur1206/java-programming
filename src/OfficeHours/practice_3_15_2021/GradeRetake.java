package OfficeHours.practice_3_15_2021;
/*

[If statements, operators]

Write a program that will give the grade after the retake. The program should read a score of the test and which attempt it was.

    If its the first attempt -> subtract 10%
    If its the second attempt -> subtract 20%
    If its the third attempt -> subtract 35%
 */
public class GradeRetake {
    public static void main(String[] args) {
        int baseGrade = 90;
        int numberOfAttempts= 2;
        int retakePenalty = 0;
        if(numberOfAttempts ==1){
           retakePenalty = (int)(baseGrade *0.10);
        }
        if(numberOfAttempts ==2){
            retakePenalty = (int)(baseGrade *0.20);
        }
        if(numberOfAttempts ==3){
            retakePenalty = (int)(baseGrade *0.35);
        }
        System.out.println("grade after retake attemmpt" +numberOfAttempts +" was "+(baseGrade -retakePenalty ));
    }
}
