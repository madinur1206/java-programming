public class Employee {
    String name;
    String jobTitle;
    // instance method;
    public void  work() {
        System.out.println(name+ " works as " + jobTitle );
    }

}
class people {
    public static void main(String[] args) {
        Employee employee1= new Employee() ;
        employee1 .name = "Elshat";
        employee1 .jobTitle = "SDET";
        employee1 .work() ;
        Employee employee2= new Employee() ;
        employee2 .name = "madinur";
        employee2 .jobTitle = "project manager";
        employee2 .work() ;

    }
}