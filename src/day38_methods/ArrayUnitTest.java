package day38_methods;

public class ArrayUnitTest {
    public static void main(String[] args) {
        int [] nums = {5,23,1,543,90};
        ArrayUtils .printArray(nums) ;
        ArrayUtils .printArray(new int[]{2,4,56,78,90,87});
        System.out.println("sum = "+ArrayUtils.sum(nums) );
        int [] nums2= {4,1,5,8};
        System.out.println("found = "+ArrayUtils.contains(nums2 ,5) );
        System.out.println("found= "+ ArrayUtils.contains(nums2 ,10));
    }
}
