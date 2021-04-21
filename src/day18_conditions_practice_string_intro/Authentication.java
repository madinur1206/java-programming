package day18_conditions_practice_string_intro;

public class Authentication {
    public static void main(String[] args) {
        int expLast4SSN= 1234;
        int expPinCode = 4321;
        int last4SSN=134;
        int pinCode = 431;
        if(last4SSN ==expLast4SSN &&pinCode ==expPinCode  ){
            System.out.println("Authentication successful");
        }else{
            System.out.println("Authentication unsuccessful");
            if(last4SSN !=expLast4SSN ){
                System.out.println("Last four SSN number is not correct");
            }
            if (pinCode !=expPinCode ){
                System.out.println("Pin code is incorrect");
            }
        }
    }
}
