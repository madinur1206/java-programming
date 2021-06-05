package day50_inheritance;

public class Student extends Person {
    int studentId;
    String school = "Cybertek school";
    public void study (String topic) {
        System.out.println("student is studying "+ topic );
    }
}
