package day19_class_vs_0bject_string;

public class StringLength {
    public static void main(String[] args) {
        String passWord ="madinur";
        System.out.println(passWord .length() );
        System.out.println("madinur".length());
        String firstName = "Elshat";
        System.out.println(firstName .length() );
        int count = firstName .length() ;
        System.out.println("count = " + count);
        String password = "abc123";
        if(password.length() >=6){
            System.out.println("valid amazon password");
        }else {
            System.out.println("password too short");
        }
    }
}
