package day45_opp;

public class ComparingStrings {
    public static void main(String[] args) {
        String word1= "java";//in string pool
        String word2 = "java";// re_use from string pool
        String word3 = new String("java"); // created in heap .outside string pool
        String word4= new String("java");// created new object in heap ,outside in string pool

        System.out.println(word1==word2);
        System.out.println(word1==word3);
        System.out.println(word3==word4);

        System.out.println(word1.equals(word2) );
        System.out.println(word1.equals(word3) );
        System.out.println(word3.equals(word4) );
    }
}
