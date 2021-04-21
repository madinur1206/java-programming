package Practice;
import java.util.*;

public class email1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String email= scan.nextLine();
      if(email .contains("_") ){
          String firstName = email .substring(0,email.indexOf("_") );
          String lastName = email .substring(email .indexOf("_")+1,email .indexOf("@") ) ;
          System.out.println(lastName  +"_"+firstName  +email.substring(email.indexOf("@") ) );
      }else{
          System.out.println(email );
      }
    }

}
