package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {


        String company = "Capital one";
        System.out.println(company.contains("l o") );
        if(company.contains(" ")){
            System.out.println("multiple word company name");
        }else{
            System.out.println("single word company name ");
        }
        String etsyTitle= "Wooden spoon | Etsy";
        if(etsyTitle .contains(" | ")) {
            System.out.println("Pass- title check passed");
        }else{
            System.out.println("Fail - title check failed");
        }
        String firstname = "Madinur";
        if(firstname .contains("a") && firstname .contains("r")){
            System.out.println("madinur contains a and r at the same time");
        }else {
            System.out.println("a or r not present");
        }
        String email= "elshat0707@gmail.com";
        if(email .contains("@") &&email.endsWith(".com")) {
            System.out.println("Valid E-mail");
        } else{
            System.out.println("Invalid E-mail");
        }
        if(email.toLowerCase().contains("s") ) {
            System.out.println("s is present");
        } else{
            System.out.println("s is not present");
        }
    }
}
