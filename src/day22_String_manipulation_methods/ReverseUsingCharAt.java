package day22_String_manipulation_methods;

public class ReverseUsingCharAt {
    public static void main(String[] args) {
        String word = "noon";
        System.out.println(word.charAt(3)+""+word.charAt(2)+""+ word.charAt(1)+word.charAt(0)) ;
        String reversed= word.charAt(3)+""+word.charAt(2)+""+ word.charAt(1)+word.charAt(0);
        System.out.println("reversed = " + reversed);
        System.out.println("word = " + word);
        if(word.equalsIgnoreCase(reversed) ){
            System.out.println("palindrome word");
        }else{
            System.out.println("Not palindrome word");
        }

    }
}
