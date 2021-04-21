package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message ="Sender: [Nadir] From Number<2223334444> Message:{Hello, lets code some java}";
        //String sender,mobile,text;
        String sender = message.substring(message .indexOf("[")+1,message.indexOf("]") );
        System.out.println("sender = " + sender);
        String mobile = message.substring(message .indexOf("<")+1,message .indexOf(">") ) ;
        System.out.println("mobile = " + mobile);
        String text = message.substring(message .indexOf("{")+1,message.indexOf("}") );
        System.out.println("text = " + text);
        System.out.println(" madinur ".trim() );

    }
}
