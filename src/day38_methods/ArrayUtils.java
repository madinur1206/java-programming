package day38_methods;

import java.util.Arrays;

public class ArrayUtils {
    public static void main(String[] args) {

    }
    public static void printArray(int [] nums){
      for(int eachNum: nums){
          System.out.print(eachNum +" ");
      }
        System.out.println();

        }
        public static int sum(int [] nums){
        int sum = 0;
            for (int eachNum :nums) {
                sum+= eachNum ;

            }
            return sum;
        }

        public static boolean contains(int [] nums, int num){
        boolean found = false;
        for(int each: nums ){
            if(each==num){
                found=true;
                break;
            }
        }
        return found;
        }
    }

