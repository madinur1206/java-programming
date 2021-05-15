package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodWithListReturn {
    public static void main(String[] args) {
        //System.out.println(System.nanoTime());
        long start = System.nanoTime() ;
       List<Integer> mlnNums = getIntegerList() ;
        long end= System.nanoTime() ;
        System.out.println("Array list time= " + (end -start));
        //System.out.println(mlnNums );
        long st =   System.nanoTime() ;
        int[] arr= getIntegerArray() ;
        long en= System.nanoTime() ;

       // System.out.println(arr);
        System.out.println(" Array time= "+(en -st));

    }
    public static  List <Integer>  getIntegerList( ){
        List <Integer>  nums = new ArrayList<>();
        for (int i = 0; i <= 1000000; i++) {
            nums.add(i);
        }
        return nums;
    }
    public static int[] getIntegerArray() {
        int[] nums = new int[1_000_001] ;
        for (int i = 0; i <=1000000; i++) {
            nums[i]= i;

        }
        return nums;
    }


}
