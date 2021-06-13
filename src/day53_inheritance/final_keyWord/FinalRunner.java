package day53_inheritance.final_keyWord;

public class FinalRunner {
    public static void main(String[] args) {
        System.out.println(TestData.ADMIN_USERNAME );
        final int SSN =234567;
       // ssn= 67890; //Error can't reassign
    }
}
