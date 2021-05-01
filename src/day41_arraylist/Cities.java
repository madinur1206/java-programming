package day41_arraylist;

import java.util.ArrayList;

public class Cities {
    public static void main(String[] args) {
        //declare arraylist
        ArrayList <String> cities= new ArrayList<>();
        cities .add("hotan") ;
        cities .add("urumqi") ;
        cities .add("kashgar") ;
        cities .add("doha") ;
        cities .add("dubai") ;
        cities .add(0,"new york") ;
        //print all values in same line
        System.out.println(cities);
        //print first and last city
        System.out.println("first city = " +cities.get(0) );
        System.out.println("Last city = "+ cities.get(cities.size()-1) );
        //print count of itemns in arraylist
        System.out.println("count of items = "+cities .size() );
        int size = cities.size() ;
        System.out.println("there are "+ size +" cities in the list");
        //for loop and print all values in same line

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities .get(i) +", ");

        }
        System.out.println();
        //for each loop
        for (String eachcity:cities ){
            System.out.print(eachcity +" ");
        }
        //delete items from arraylist
        // remove using index
        //remove using object
        System.out.println();
cities.remove("doha");
        System.out.println("after remove = "+ cities );
        cities.clear() ;
        System.out.println(cities );

        if(cities .isEmpty() ){
            System.out.println("list is empty");
        }
        if(cities.size() ==0){
            System.out.println("list is empty");
        }


    }
}
