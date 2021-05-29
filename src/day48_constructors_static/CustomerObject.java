package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObject {
    public static void main(String[] args) {
        Customer cs1= new Customer() ;
        System.out.println(cs1);
        cs1.setId(1) ;
        cs1 .setName("Bob");
        System.out.println(cs1);
        Customer cs2 = new Customer("Mike",2);// create object and assign value in same statement
        Customer cs3= new Customer("John Ward III",4873);
        System.out.println(cs2);
        System.out.println(cs3);
        //array of customers
        Customer [] todaysCustomers = {cs1,cs2,cs3,new Customer("Madinur",227) };


        //arraylist of customer objects
        List<Customer>  customerList = new ArrayList<>() ;
        customerList.add(cs1) ;
        customerList .add(cs2);
        customerList .add(cs3) ;
        customerList .add(new Customer("Madinur",227)) ;
        customerList .add(new Customer("Elshat",668));

        //print info of first customer object in array and arraylist
        System.out.println(todaysCustomers [0].toString() );
        System.out.println(customerList .get(0).toString() );
        System.out.println(customerList );
        System.out.println("-----for loop------");
        for (int i = 0; i < customerList .size() ; i++) {
            System.out.println(customerList .get(i) );

        }
        // for each loop
        System.out.println("----for each loop-----");
        for(Customer customer: customerList ) {
            System.out.println(customer );
        }
        //print only names of customer use lamda expression
        System.out.println("-----names of customers----");
        customerList .forEach(each-> System.out.println(each.getName() )) ;

        // different way for eacjh
        for(Customer eachCustomer:customerList ) {
            System.out.println(eachCustomer .getName() );
        }

    }
}
