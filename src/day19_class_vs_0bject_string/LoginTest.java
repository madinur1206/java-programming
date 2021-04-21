package day19_class_vs_0bject_string;

public class LoginTest {
    public static void main(String[] args) {

        String expUserName= "cybertek";
        String expPassWord = "Abc123";
        String userName = "CYBERTEK";
        String password = "Abc123";
        if(expUserName .equalsIgnoreCase(userName ) && expPassWord .equals(password ) ){
            System.out.println("Pass - user successfully logged in");

        }else {
            if(!expUserName.equalsIgnoreCase(userName ) ){
            System.out.println("Incorrect Username");
        }else{
                System.out.println("Incorrect password");
            }
        }
    }
}
