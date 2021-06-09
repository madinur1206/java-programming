package day51_inheritance;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee developer = new Employee() ;
        developer .jobTitle ="java Developer";
        System.out.println("developer .calculateSalary(55.0) = " + developer.calculateSalary(55.0));
        double annualDevSalary = developer.calculateSalary(60.0) ;
        System.out.println("annualDevSalary = " +Math.round(annualDevSalary) );

        Contractor sdetContractor = new Contractor() ;
        sdetContractor .jobTitle ="SDET";
         double sedtSalary = sdetContractor .calculateSalary(55.0) ;
        System.out.println("sedtSalary = " + sedtSalary);
        System.out.println(developer .toString() );
        System.out.println(sdetContractor );

    }
}
