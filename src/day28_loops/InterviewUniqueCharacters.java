package day28_loops;

public class InterviewUniqueCharacters {
    public static void main(String[] args) {

        String unique= "";
        String word = "helloworld";
        for (int i = 0; i <word.length() ; i++) {
           if( !unique.contains(word.charAt(i)+"" )) {
               unique +=word.charAt(i);

           }



        }
        System.out.println("Unique letters: " +unique );
    }
}
