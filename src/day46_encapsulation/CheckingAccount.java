package day46_encapsulation;
/*
public void seAccountInfo(long accountNumber,String accountHolder, double balance,String type.)
1.this.accountNumber = accountNumber;
2.setAccountNumber(accountNumber)
 */

public class CheckingAccount {
    //balance, accountNumber accountHolder, Type= "checking"
    private double balance;
    private long accountNumber;
    private String accountHolder;
    private String type =" checking";//default is checking we can change it if we need it
    //right click __ generate__choose getter&&setter choose all __hold shift

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
