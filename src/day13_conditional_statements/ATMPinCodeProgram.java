package day13_conditional_statements;

public class ATMPinCodeProgram {
    public static void main(String[] args) {
        System.out.println("**** WELCOME TO TD BANK ATM ****" );
        int secretPinCode= 2233;
        int inputPinCode = 223;
        if(secretPinCode ==inputPinCode ){
            System.out.println("Welcome to your account.\nYou can withdraw, check balance, deposit");
        }else{
            System.out.println("Incorrect pincode! "+ inputPinCode );
            System.out.println("please try it again.");
        }
        System.out.println("Thank you for using TD Bank ATM");
    }

}
