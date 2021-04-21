package day35_methods_with_param;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter  name:");
        String  name = scan.nextLine() ;
        System.out.println("Enter domain");
        String domain = scan.nextLine() ;
        buildEmail(name,domain );
    }
    public static void buildEmail(String name, String domain){
        name = name.replace(" ","_").toLowerCase() ;
        System.out.println(name+"@"+domain +".com");

    }
}
