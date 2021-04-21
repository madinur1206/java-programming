package day39_wrapper_classes;

public class WrapperClassMethod {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(3,2));
        System.out.println(Integer.min(10,5) );
        System.out.println("Min int= "+Integer.MIN_VALUE  );
        System.out.println("Max int= "+ Integer.MAX_VALUE );

        System.out.println(Double.max(1.1,3.4) );
        System.out.println(Double.min(1.1,3.4) );
        System.out.println("Min double= "+Double.MIN_VALUE  );
        System.out.println("Max double= "+ Double .MAX_VALUE );

        System.out.println(Double.compare(3.4,1.3) );
        System.out.println(Double.compare(4.2,4.2) );
        System.out.println(Double.compare(1.3,3.5) );

        System.out.println(Character.isDigit('8') );
        System.out.println(Character.isDigit('v'));
        System.out.println(Character.isAlphabetic('q') );
        System.out.println(Character.isLetter('r') );
        System.out.println(Character.isLetter('9') );
        char letter = 'A';
        if(Character.isUpperCase(letter) ){
            System.out.println("letter "+letter +" is upper case");

            String word = "JaVa iS FuN";
            for (int i = 0; i < word.length() ; i++) {
                if(Character. isLowerCase(word.charAt(i) ) ){
                    System.out.print(word.charAt(i) );
                }

            }
            System.out.println(Character.MAX_VALUE );
            System.out.println(Character.MIN_VALUE );

            System.out.println(Boolean.TRUE );


        }
    }
}
