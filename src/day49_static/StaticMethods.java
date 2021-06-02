package day49_static;

public class StaticMethods {
    int num= 10;
    static int count = 5;
    public static void displayMessage(String message) {
        System.out.println("message : " +message );
        //System.out.println("num= "+num);// error becuase int num variable is not static.it is instance variable. can.t be used for static method
        System.out.println("count = " + count);

    }
    public static void anotherStaticMethod () {
        System.out.println("another static method");
        displayMessage("wooden spoon") ;// it can call another static method
    }
    //staticMethods.instanceMethod(); no
    // staticMethood stm = new staticMethods();
    //stm.instanceMethod();
    public void instanceMethod () {
        System.out.println("instanceMethod");
        System.out.println("num = "+ num);
        System.out.println("count= "+count);
        displayMessage("hello from instance method") ;
    }

}
