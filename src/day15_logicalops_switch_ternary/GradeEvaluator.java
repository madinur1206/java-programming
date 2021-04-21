package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {

        char grade ='E';
        if(grade=='A' ||grade=='B' ||grade=='C'){
            System.out.println("passed with " + grade);
        }else if  (grade == 'D'){
            System.out.println("Quality for retake with " + grade );
        }else if ( grade=='E'){
            System.out.println("faild with " + grade );
        }else{
            System.out.println("invalid grade");
        }
    }
}
