package day51_inheritance;

public class Contractor extends Employee  {
    @Override
    public String toString() {
        return "Contractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }

    @Override //1. let's everyone knopw you are overriding
    //2. ensures that this method is being overriden. it shows error
    public double calculateSalary (double hourlyRate) {
        return 50*40*hourlyRate ;


    }
}

