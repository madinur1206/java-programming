package day42_arraylist;
import java.util.*;

public class sumIntegerListMethod {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList(Arrays.asList(1,2,3,4,5) );
        System.out.println(sumIntegerList(nums ) );

    }
    public static int sumIntegerList(List<Integer>list ) {
        int sum = 0;
        for (int eachNum :list){
            sum += eachNum ;
        }
        return sum;

    }
}
