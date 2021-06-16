package day54_abstraction;
// we add abstract keyword to make a class abstract, we can add both abstract and onon abstract class into
// abstract class.we can not creat object of student class.student class will be parent class for all other
// types of student related class
public  abstract class Student {

    public void code (String language) {
        System.out.println("Student is coding using "+language );
    }
    //we can add abstract methods in to abstract class
    // it is created used abstract keyword
    // it doesn't have method body /implementation
    public abstract void attendClass();
}
//online student will extend student abstract class
//
// this class is considered to be concrete class
// it is responsible for implementing all abstract methods (if any )
class OnlineStudent extends Student {
    @Override
    public void  attendClass() {
        System.out.println("Online class attending the class using zoom");
    }
}
class School {
    public static void main(String[] args) {
        OnlineStudent  onlineStudent = new OnlineStudent() ;
        onlineStudent .code("java") ;
        onlineStudent .attendClass() ;
        CampusStudent  campusStudent = new CampusStudent() ;
        campusStudent .code("java") ;
        campusStudent .attendClass() ;
    }
}