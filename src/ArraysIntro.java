public class ArraysIntro {
    public static void main(String[] args){
        int [] nums= new int [3];
        nums [0]=5;
        nums [1]=7;
        nums [2]=10;
        System.out.println(nums[0]);
        System.out.println(nums [1]);
        System.out.println(nums [2]);
        int len = nums.length ;
        System.out.println(len);
        nums[0]=100;
        nums[1]= 300;
        nums [2]=nums[1] ;
        System.out.println(nums[0]);
        System.out.println(nums [1]);
        System.out.println(nums [2]);
    }
}
