package OfficeHours.practice_3_30_2021;

public class prefix {
    public static void main(String[] args) {
        String str= "abXYabc";
        int n=3;
        String prefix= str.substring(0,n) ;
        String remaining = str.substring(n) ;
        System.out.println(remaining .contains(prefix ) );
    }
}
