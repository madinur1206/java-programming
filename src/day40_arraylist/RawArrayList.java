package day40_arraylist;
import java.util.*;

public class RawArrayList {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        List list2 = new ArrayList();

        list1.add("java") ;
        list1.add("coffee");
        list1.add(1234);
        list1.add(234.5);
        list1.add(true) ;
        list1.add("wooden spoon");
        System.out.println(list1);
        System.out.println(list1.size() );
    }
}
