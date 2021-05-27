package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount account1= new CheckingAccount() ;
        account1 .setBalance(12345.67) ;
        account1 .setAccountNumber(432112345678l) ;
        account1 .setAccountHolder("elshat omar") ;
        account1 .setType("360 checking") ;
        System.out.println(account1 );
    }
}
