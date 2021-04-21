package Practice;

public class Employee {
    public static void main(String[] args){
        String firstName = "Madinur" , lastName = "Mahmud", companyName = "Qatar Airways";
        int salary = 100000; byte startDate = 4 ; short startMonth = 5, startYear =2021;
        boolean fullTime = true;
        String jobTitle = "SDET", officeAddress = " 2375 Westbury Road K2C 1K3";
        String fullName = "" +firstName +" "+ lastName ;
        String fullStartDate = "" +startMonth +"."+ startDate +"."+startYear ;
        String email = "" +firstName +startDate +"@ $"+companyName +".com";
        String  salaryAfter3Years = ""+ salary+(startMonth*10000);
        System.out.println(firstName );
        System.out.println(lastName);
        System.out.println(companyName  );
        System.out.println(salary );
        System.out.println(startDate );
        System.out.println(startMonth );
        System.out.println(startYear );
        System.out.println(fullTime  );
        System.out.println(jobTitle );
        System.out.println(officeAddress );
        System.out.println(fullName  );
        System.out.println(fullStartDate  );
        System.out.println(email );
        System.out.println(salaryAfter3Years  );


    }
}
