package java_interview_questions_coding;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveSomeValuesArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,100,101,200,300));
        ArrayList<Integer> list2= new ArrayList<>();
        for(int eachNum :list1){
            if(eachNum <100){
                list2 .add(eachNum );
            }
        }



        System.out.println(list2);
    }
}
