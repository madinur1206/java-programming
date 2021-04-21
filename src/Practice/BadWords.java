package Practice;

public class BadWords {
    public static void main(String[] args) {
        String message = "dumb";
        if(message.contains("fuck")){
            System.out.println("Message not sent");
        }else{
            System.out.println("Message sent");
        }
    }
}
