package OfficeHours.practice_06_07_2021;

import java.util.ArrayList;

public class WalmartTest {
    public static void main(String[] args) {
        WalmartStore store1= new WalmartStore("VA") ;
        System.out.println(store1);
        Item pen = new Item("pen",1.4,10) ;
        Item hat = new Item("hat",3.5,20) ;
        ArrayList<Item> allItems= new ArrayList<>();
        allItems .add(pen);
        allItems .add(hat);
        WalmartStore store2= new WalmartStore("CA",allItems ) ;
        System.out.println(store2 );
        System.out.println(WalmartStore .companyName );


    }
}
