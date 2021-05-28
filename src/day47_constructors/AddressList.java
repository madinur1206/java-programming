package day47_constructors;

public class AddressList {
    public static void main(String[] args) {
        Address cybertekAddress = new Address();//calling the constructor automatically
        cybertekAddress .setStreet("7925 Jones Branch Dr Suite 3300") ;
        cybertekAddress .setCity("McLean") ;
        cybertekAddress .setState("VA");
        cybertekAddress .setZipCode("22182") ;
        System.out.println("cybertek school address: "+cybertekAddress .toString() );
        cybertekAddress .setStreet("7925 Jones Branch Dr Suite 3200") ;
        System.out.println("Address after update = "+cybertekAddress );
        System.out.println("street info = "+ cybertekAddress .getStreet() );

        Address newAddress= new Address() ;
        //System.out.println("new address= "+ newAddress );
        newAddress .setStreet("7925 Jones Branch Dr Suite 3100") ;
        newAddress .setCity("ottawa") ;
        newAddress .setState("ON") ;
        newAddress .setZipCode("1C72ER") ;
        System.out.println(newAddress .toString() );

        Address papaJon= new Address("7925 Jones Branch Dr Suite 3100","McLean","VA","22182");
        System.out.println("papajon address" +newAddress .toString() );



    }
}
