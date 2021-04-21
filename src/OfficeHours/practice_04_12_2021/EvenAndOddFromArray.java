package OfficeHours.practice_04_12_2021;

import java.util.*;
/*
Write a program that can count the even and odd number from an array of integers
Use for each to make it easier

Ex:
Input: [4,1,3,12,5]
Output:
Even: 2
Odd: 3
 */
public class EvenAndOddFromArray {
    public static void main(String[] args) {

        int [] nums = {4,1,3,12,5};

        int even = 0;
        int odd = 0;
        for(int eachNum: nums){
            if(eachNum %2 ==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even : "+ even );
        System.out.println("Odd : " +odd);

        int [] evenNumbers = new int [even];
        int [] oddNumbers = new int [odd];

        for (int i = 0,e =0,o =0; i < nums.length  ; i++) {
            if (nums[i]%2 ==0) {
                evenNumbers [e++]= nums [i];
            }else {
                oddNumbers [o++]= nums [i];
            }

            }
        System.out.println(Arrays.toString(evenNumbers ));
        System.out.println(Arrays.toString(oddNumbers  ));
        }

    }

