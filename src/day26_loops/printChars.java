package day26_loops;

public class printChars {
    public static void main(String[] args) {
        String word= "omar";
        for (int i = word.length()-1; i >=0 ; i--) {
            System.out.print(word.charAt(i) );

        }
    }
}
