package Practice;
/*

[Operators]

Analyze the following without intellij. Calculate the output step by step

    int a = 200;
    int b = -a++ + - --a * a-- % 2 + a;

What is the value of a and b?
 */

public class Operators2 {
    public static void main(String[] args) {
        int a =200;
        int b = -a++ + - --a * a-- % 2 + a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
