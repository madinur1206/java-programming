package Practice;
/*
if statement, multibranch if, && and ||
-------------------------------------------------

Campus time: User enters a time(hour in 24 hour format) and will be able to find out if the campus is open or not
> Campus is open from 8 am(8) to 11 pm (23)
> If user enters a time within the open time they should see message : “open” but if the time entered is outside of operating hours they should see: “ closed”
> If the user enters an invalid hour (negative number or more than 24 hours) they should see an error message: “invalid time”
 */
import java.util.Scanner;

public class CampusTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a time: ");
        double time = scan.nextDouble() ;
        if(time>=8&&time<=23){
            System.out.println("Open");
        }else if(time<8&&time>0) {
            System.out.println("Closed");
        }else if(time>23&&time<=24){
            System.out.println("closed");
        }else {
            System.out.println("Invalid Time");
        }

    }
}
