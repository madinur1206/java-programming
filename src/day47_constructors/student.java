package day47_constructors;

public class student {
    //No_args constructor
    public student () {
        System.out.println("no args constructor");
    }
    public student (String name) {
        System.out.println("name param constructor | name = "+name);
    }
    //constructor with age
    public student (int age ) {
        System.out.println("age param constructor |age= "+age);
    }
    public student (String name, int age ) {
        System.out.println("name & age param constructor" +name+","+ age);
    }
}
