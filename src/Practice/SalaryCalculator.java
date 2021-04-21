package Practice;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate = 20;
        int weeklyHours= 40;
        int numberOfWeeks= 53;
        int salary= 0;
        if(hourlyRate >0&&weeklyHours >0&&weeklyHours <=65&&numberOfWeeks >=1&&numberOfWeeks <=52){
            salary = hourlyRate *weeklyHours *numberOfWeeks ;
            System.out.println("salary = $" + salary);

        }else if(hourlyRate<=0){
            System.out.println("Hourly Rate cannot be Negative or Zero");
        }else if(weeklyHours <=0 ||weeklyHours >65){
            System.out.println("Weekly Hours cannot be less than 1 or greater than 65");
        }else if(numberOfWeeks <1||numberOfWeeks >52){
            System.out.println("Number of weeks cannot be less than 1 or greater than 52");
        }
    }
}
