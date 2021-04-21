package Practice;

public class Password {
    public static void main(String[] args) {
        String userName = "madinur";
        String password = "elshat1206";
        if(password.length() >= 5) {
            if(!password .contains(userName )) {
                System.out.println("Valid password");
            }else{
                System.out.println("Invalid password :"+ password + " , username should not be in it");
            }

        }else{
            System.out.println("password less than 5 characters");
        }
    }
}
