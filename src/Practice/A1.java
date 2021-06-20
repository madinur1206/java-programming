package Practice;

public class A1 {
    static int count;

    public A1() {
        count++;
    }

    public A1(int i) {
        count += i;
    }

    public A1(String s) {
        count += s.length();
    }
}
class Test{
    public static void main(String[] args) {
        new A1();
        A1 a= new A1() ;
        A1 a2= new A1("word") ;
        A1 a3= new A1(5) ;
        System.out.println(A1.count);

    }
}