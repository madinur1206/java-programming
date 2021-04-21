package Practice;

public class CoolName {
    public static void main(String[] args) {
        String name= "zeyneb";
        if(name.startsWith("a")||name.startsWith("z") ){
            System.out.println("Your name is cool");
        }else if(name.startsWith("m")){
            System.out.println("Almost cool");
        }else{
            System.out.println("Sorry not a cool name");
        }
    }
}
