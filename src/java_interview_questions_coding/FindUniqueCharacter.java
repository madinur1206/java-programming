package java_interview_questions_coding;


public class FindUniqueCharacter {
    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        System.out.println(FindUnique(str) );
    }
    public static String FindUnique(String str) {
        String[] arr = str.split("");
        String uniqueLetters = "";
        for (int j = 0; j < arr.length; j++) {
            int num = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(arr[j])) {
                    num++;
                }
            }
            if (num == 1) {
                uniqueLetters += arr[j];
            }

        }
 return uniqueLetters ;

    }


        }


