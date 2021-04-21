package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
loginVoid("cybertekStudent","abc123") ;
loginVoid("cybertek1student","345asd") ;
login("cybertekStudent","abc123") ;

boolean isLoginSuccess= login("nadir","mountain") ;
        System.out.println("is log in success:" + isLoginSuccess );
        if(login("nadir","mountain")){
            System.out.println("welcome to canvas,select course or calendar");
        }else{
            System.out.println("Something wrong with your credential");
        }

    }


    public static  void loginVoid (String userName,String password) {
        String secretUserName ="cybertekStudent";
        String secretPassword="abc123";
        if(userName .equalsIgnoreCase(secretUserName)&&password .equals(secretPassword ) ) {
            System.out.println("Login sucessful ,welcome to cybertekStudent");
        }else{
            System.out.println("Incorrect user name or password");
        }
    }
    public static boolean  login(String userName,String password){
        String secretUserName ="cybertekStudent";
        String secretPassword="abc123";
        if(userName .equalsIgnoreCase(secretUserName)&&password .equals(secretPassword ) ) {
            return true;
        }else{
            return false;
        }
    }
}