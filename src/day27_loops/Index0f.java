package day27_loops;

public class Index0f {
    public static void main(String[] args) {
        String word= "github";
        char letter = 't';
        int count = -1;

        for (int n= 0; n <word.length() ; n++) {
            if(word.charAt(n) ==letter){
                count = n;
                System.out.println(letter +" is found at " +count);
            }else{
                System.out.println("not found");
            }

        }
    }
}
