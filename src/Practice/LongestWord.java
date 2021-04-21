package Practice;

public class LongestWord {
    public static void main(String[] args) {
        String  a = "java";
        String b = "mouse";
        String c= "apples";
        String longestWithA= "";
        if(a.contains("a") && a.length() >longestWithA .length() ){
            longestWithA =a;
        }
        if(b.contains("a") && b.length() >longestWithA .length() ){
            longestWithA = b;
        }
        if(c.contains("a") && c.length() >longestWithA .length()){
            longestWithA =c;
        }
        if(longestWithA .isEmpty() ){
            System.out.println("NO words contains A");
        }else {
            System.out.println("Longest word with A " + longestWithA);
        }





    }
}
