package day21_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String word = "madinur";
        System.out.println(word.charAt(0) );
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(4));
        System.out.println(word.charAt(5));
        System.out.println(word.charAt(6));
       String company = "Cybertek";
        System.out.println("first letter " +company.charAt(0));
        char first = company.charAt(0) ;
        char second= company.charAt(1);
        char third= company.charAt(2);
        char forth= company.charAt(3);
        char fifth= company.charAt(4);
        char six= company.charAt(5);
        char seven= company.charAt(6);
        char eight= company.charAt(7);
        System.out.println(first+" "+second +" "+third +" "+forth+" "+fifth +" "+six+ " "+seven +" "+eight );

        String withSpaces=first+" "+second +" "+third +" "+forth+" "+fifth +" "+six+ " "+seven +" "+eight;
        System.out.println("withSpaces = " + withSpaces);




    }
}
