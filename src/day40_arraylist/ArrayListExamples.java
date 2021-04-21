package day40_arraylist;
import java.util.*;
public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<Integer>  nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(11);
        System.out.println("Size = " +nums.size() );
        //nums.add("java"); error because restricted type

        //Reading from arraylist use get
        System.out.println("index 0 = " + nums.get(0) );
        System.out.println("Index 1 = " + nums.get(1) );
        System.out.println("Index 2 = " + nums.get(2) );
       // System.out.println("Index 2 = " + nums.get(3) ); index  out of bound exception ;

        //print all values in same line :
        System.out.println(nums); //for arrays----- Arrays.toString(numArray)

        //remove (index)--- removes element at given index
        nums.remove(1) ;
        System.out.println(nums);




    }
}
