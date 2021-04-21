package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {

        String total = "345";
        int count = Integer.parseInt(total );
        System.out.println(count);
        int num = Integer.parseInt("55");
        System.out.println(num );

        String strPrice = "123.99";
        double price = Double.parseDouble(strPrice );
       if(price >100){
           System.out.println("expensive");
       }else{
           System.out.println("cheap");
       }
       String sentence = "I wrote 100 lines of code ";
       String [] words= sentence .split(" ") ;
      int lineOfCode = Integer.parseInt(words[2]);
        System.out.println(lineOfCode );

    }
}
