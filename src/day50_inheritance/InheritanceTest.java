package day50_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1= new Person ();
        p1.name= "madinur";
        p1.age= 30;

        p1.walk() ;
        p1.work("SDET") ;
        p1.talk() ;

        Teacher t1= new Teacher();
        t1.teacherID =1234;
        t1.name = "elshat";
        t1.age= 24;
        t1.talk() ;
        t1.walk() ;
        t1.teach("java") ;

        Student s1= new Student() ;
        s1.age = 19;
        s1.studentId = 6789;
        s1.study("selenium") ;
        s1.name= "Madinur";

    }
}
