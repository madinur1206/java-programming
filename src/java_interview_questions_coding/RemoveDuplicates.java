package java_interview_questions_coding;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AAABBBCCC";
        System.out.println(removeDup(str) );

    }
    public static String removeDup(String str){
        String result = "";
        for (int i = 0; i < str.length() ; i++) {
            if (!result.contains(""+str.charAt(i) ) ){
                result+=""+str.charAt(i) ;
            }

        }
        return result;
    }
}
