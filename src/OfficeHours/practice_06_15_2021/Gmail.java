package OfficeHours.practice_06_15_2021;

public class Gmail extends Email {
    static String domain;
    static {
        domain= "Gmail";
    }
    public Gmail(String address, int numberOfEmail) {
        super(address, numberOfEmail);
    }
    public static void sendEmail () {
        System.out.println("sending from Gmail");

    }
    public static void sendSuperEmail() {
        Email.sendEmail() ;
    }
}
