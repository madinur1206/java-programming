package Practice;
import java. util.*;
public class ArrayQuizz {
    public static void main(String[] args) {
        char [] array = {'D','C','B','A'};
        Arrays. sort(array );
        for( char each :array){
            System.out.println(each +" ");
            if (each=='D'){
                continue;
            }
        }
    }
}
