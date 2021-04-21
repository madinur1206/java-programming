package day40_arraylist;

import java .util.*;

public class ArrayListLoop {
    public static void main(String[] args) {
        List <Integer> nums = new ArrayList<>();//polymorphic way of declaring
        System.out.println(nums);
        System.out.println("Size = "+ nums.size() );
        nums.add(5); nums.add(4); nums.add(6); nums.add(6);nums.add(11);nums.add(67);nums.add(11);
        System.out.println("nums = "+ nums);
        nums.remove(0) ;
        System.out.println(nums);
        // remove by value object
        nums.remove(new Integer(11));
        System.out.println(nums);
        //for loop - iterate through all values and print;

        for(int i = 0 ;i<nums.size() ;i++) {
            System.out.println(nums.get(i));
        }
            //use for each loop
            for (int each :nums){
                System.out.print(each+" ");
            }

        }



    }

