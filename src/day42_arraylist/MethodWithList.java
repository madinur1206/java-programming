package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodWithList {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("java");words.add("HTML") ;words.add("selenium");
        words.add("a");words.add("input");words.add("title");
        printStrList(words) ;
        printStrList(Arrays.asList("java","html","title") ) ;

    }
    public static void printStrList (List<String> stringList ){//"java","apple","coffee","tea"
        for(String str:stringList ){
            System.out.println(str +" ");
        }
        System.out.println();
    }

}
