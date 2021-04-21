package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String [] student1 = {"4377","madinur","mahmud","B22","3439881934"};
        String [] student2= new String[5];
        student2 [0]="MD1234";
        student2 [1]= "madinur";
        student2 [2]= "mahmud";
        student2 [3]= "B22";
        student2 [4]= "343-988-1934";


        System.out.println("student1 id= " +student1 [0]);
        System.out.println("student1 first name = " +student1 [1]);
        System.out.println("student1 last name= " +student1 [2]);
        System.out.println("student1 batch number= " +student1 [3]);
        System.out.println("student1 phone number= " +student1 [4]);



        System.out.println("student2 id= " +student2 [0]);
        System.out.println("student2 first name = " +student2 [1]);
        System.out.println("student2 last name= " +student2 [2]);
        System.out.println("student2 batch number= " +student2 [3]);
        System.out.println("student2 phone number= " +student2[4]);


        System.out.println("student data length: "+student1.length );

        if(student1.length==5){
            System.out.println("true: pass: data array has correct length");
        }else {
            System.out.println("false: fail: data array has incorrect length");
        }
        if(student1.length==student2 .length){
            System.out.println("pass: data arrays length match");
        }else{
            System.out.println("fail: data arrays length mismatch");
        }

        System.out.println(student1[1].toUpperCase() + " " + student1 [2].toUpperCase() );

        String mobileNumber= student1[4] ;
        System.out.println(mobileNumber .startsWith("202") );
        System.out.println(mobileNumber .length() );
    }
}
