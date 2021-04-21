package day33_arrays;
import java.util.*;

public class ReverseArray2 {
    public static void main(String[] args) {
        int [] nums = {5,10,4,100};
        System.out.println("before swap: "+Arrays.toString(nums) );
        int temp = nums[0];
        nums[0]= nums[3];
        nums[3]=temp;
        System.out.println("After 1st and last swap : "+ Arrays.toString(nums) );

        String [] words = {"java","html","js","ruby","css"};
        System.out.println("before reverse words ="+ Arrays.toString(words) );
        for (int i = 0, j= words.length -1; i < words.length/2 ; i++,j--) {
            String tempWord= words [i];
            words[i]= words[j];
            words[j]= tempWord ;


        }
        System.out.println("words after reverse = " +Arrays.toString(words));

    }
}
