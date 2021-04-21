package day05_primitives_concatanation;

public class JobInfo {
    public static void main(String[] args){
        String title = "Java SDET";
        String company = "Palo Alto Networks";
        String jobDescription = "Java, Selenium, Cucumber,Junit";
        double salary = 123000.00;
        byte yearsOfExp = 3;
        boolean hasBenefits = true;

        System.out.println("job title is " +title);
        System.out.println("Company: "+company);
        System.out.println("Job Description: "+ jobDescription);
        System.out.println("Salary: $"+ salary);
        System.out.println("Years of experience: "+ yearsOfExp);
        System.out.println("Has benefits? "+ hasBenefits);
    }
}
