package day42_arraylist;

import java.util.*;

public class UniqueFromList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2,4,4,4,5,6,0,6) );
        System.out.println(nums );

        System.out.println(getUniqueInteger(nums));
    }

    public  static List<Integer> getUniqueInteger(List<Integer> nums) {
        List<Integer> uniqueList= new ArrayList<>();
        for(int num: nums){
            if(Collections.frequency(nums,num )==1 ){

                uniqueList .add(num);
            }
        }
       return uniqueList;
    }
}
