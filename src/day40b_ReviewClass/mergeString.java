package day40b_ReviewClass;

public class mergeString {
    public static void main(String[] args) {
        System.out.println(mergeString("abc","dced") );

    }
    public static String mergeString (String one, String two) {
        String merge = "";
        String bigger = "";
        int minLength =0;
        if(one.length() >two.length() ){
            bigger =one;
            minLength = two.length() ;
        }else {
            bigger=two;
            minLength =one.length() ;
        }
        for (int i = 0; i < minLength ; i++) {
            merge+=one.charAt(i)+""+two.charAt(i) ;

        }
        merge+=bigger.substring(minLength ) ;
        return merge;

    }
}
