package OfficeHours.practice_06_15_2021;

public class EmailObject {
    public static void main(String[] args) {
        Email email = new Email("madinur1206@cybertekSchool.com",67) ;
       // email.ADDRESS ="email"; Address is final so cannot be changed
        System.out.println(email);

        System.out.println(Email.domain );
        System.out.println(Gmail.domain );
        System.out.println(Yahoo.domain);
        Gmail gmail=  new Gmail("elshat@gmail.com",122) ;
        System.out.println(gmail );
        System.out.println(Email.domain );
        System.out.println(Gmail.domain );
        System.out.println(Yahoo.domain);

        Yahoo yahoo = new Yahoo("jasmine123@yahoo.com",34) ;
        System.out.println(yahoo);
        System.out.println(Email.domain );

        System.out.println(Gmail.domain );
        System.out.println(Yahoo.domain);
        Email.sendEmail() ;
        Gmail.sendEmail() ;
        Gmail.sendSuperEmail() ;

    }
}
