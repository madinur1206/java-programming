package Practice;

public class AccountNumber {
    public static void main(String[] args){
        String accountNumner = "90876";
        if(accountNumner .startsWith("2")  ) {
            if(accountNumner .length() ==7){
                System.out.println(" Valid 7 digit account number");
            }else{
                System.out.println("Invalid 7 digit account number");
            }
        }else if (accountNumner .startsWith("5")){
            if(accountNumner .length() ==10){
                System.out.println("Valid 10 digit account number");
            }else{
                System.out.println("Invalid 10 digit account number");
            }
        }else{
            System.out.println("Invalid account number");
        }

    }
}
