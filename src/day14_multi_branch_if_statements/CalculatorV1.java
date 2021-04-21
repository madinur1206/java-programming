package day14_multi_branch_if_statements;
/*
add new class CalculatorV1
add main method

num1, num2
char operator -> -, +, *, /

when operator: + : add num1, num2
when operator: - : minus num1, num2
when operator: * : multiply num1, num2
when operator: / : divide num1, num2
any other: "invalid operator"
 */
public class CalculatorV1 {
    public static void main(String[] args) {

        double num1 = 5.6;
        double num2 = 4.5;
        char operators = '%';
        if(operators=='+' ){
            System.out.println(num1+num2 );
        }else if (operators =='-'){
            System.out.println(num1 -num2 );
        }else if(operators=='*' ){
            System.out.println(num1 *num2 );
        }else if (operators =='/'){
            System.out.println(num1/num2);
        }else{
            System.out.println("invalid operator" + operators );
        }
    }
}
