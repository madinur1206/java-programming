package day31_Arrays;
import java.util.*;

public class ArrayUtil {
    public static void main(String[] args) {
        int [] nums= {100,5,1,7,0,-4,44,33};
        System.out.println(Arrays.toString(nums ) );

       Arrays.sort(nums);
        System.out.println(Arrays.toString(nums) );
        System.out.println("min value: "+ nums[0]);
        System.out.println("max value: "+nums[nums.length -1]);


        String[] words={"Java","C#","C++","Kotlin","Python","Ruby","Assembly"};
        System.out.println(Arrays.toString(words ) );
        System.out.println("["+String.join(", ",words ) +"]");
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        Arrays.sort(words,Collections.reverseOrder() );
        System.out.println(Arrays.toString(words));
    }
}
