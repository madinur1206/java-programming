package OfficeHours.practice_3_31_2021;

public class java {
    public static void main(String[] args) {
        String str= "java is fun. java class today, not javascript";
        int count= 0;
        while(str.contains("java") ){
            count++;
            str= str.replaceFirst("java","" );
        }
        System.out.println("count:" +count);
    }
}
