package day43_list_custom_classes;

public class Person {

    String firstName;
    int age;
    char gender;
    public void speak() {
        System.out.println("person is speaking");
    }
}

class people {
    public static void main(String[] args) {
        Person person1 = new Person();// create object of person class_ instantiate person class
        person1.firstName = "Bob";
        person1.age = 33;
        person1.speak() ;
        System.out.println(person1.firstName);
        System.out.println(person1.age);
        Person person2 = new Person();
        person2.firstName = "Mike";
        person2.age = 24;
        person2.gender = 'M';
        person2.speak() ;
        System.out.println(person2.firstName);
        System.out.println(person2.age);

    }
}
