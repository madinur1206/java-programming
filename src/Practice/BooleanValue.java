package Practice;
/*
[If statement, operators]

Write a program that will accept a boolean value. Print out the opposite of the given boolean

Ex: true -> false
    false -> true
 */

public class BooleanValue {
    public static void main(String[] args) {
        boolean amIHungry = false;
        if(amIHungry){
            System.out.println("false");
        }else if(!amIHungry ){
            System.out.println("true");
        }
    }
}
