package Practice;
/*

[Operators]

Analyze the following without intellij. Calculate the output step by step 

    int a = 5; // 5
    int b = a++ + a-- + a * 2 + a + ++a;

What is the value of a and b?
 */

public class Operators1 {
    public static void main(String[] args) {
        int a = 5;
        //int b = a++ + a-- +a*2+ a + ++a;
        //System.out.println("b = " + b);
         int b= a-- + --a;
        System.out.println("b = " + b);
    }
}
