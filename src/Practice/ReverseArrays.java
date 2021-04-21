package Practice;

import java.util.*;

public class ReverseArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int src=0;
        int dest=6;
        int temp= nums[src];
        nums [src]= nums[dest];
        nums [dest]= temp ;

        System.out.println(Arrays.toString(nums));
    }

}
