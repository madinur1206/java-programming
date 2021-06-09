package Practice;

import java.util.ArrayList;

public class WalmartStore {
    /*
    Create a class WalmartStore

    -> Instance variables:
        - location (String), totalWorth (double)
        - inventory (List of Items)

    -> Static variables:
        - company name (String),

    -> Constructor:
        - Accepts and initializes location, has an empty inventory

        - Overloaded: Accepts and initializes location, also accepts an ArrayList of Items for starting inventory

    -> Instance methods:

        - calculateWorth() -> Checks inventory, totals up amount of money all the items are worth. (each times price * quantity). Stores to the totalWorth variable

        - restockInventory(List of Item) -> Adds the given items to the store inventory.
            Challenge: If the item exists in the inventory already (same item name and price)


        - toString(): returns information about Item
(edited)



     */
    String location;
    double totalWorth;
    ArrayList<String> inventory;
    static String companyName ="Walmart";

    public WalmartStore (String location) {
        this.location= location ;
        inventory = new ArrayList<String>();

    }
    public WalmartStore (String location,ArrayList<String>  inventory ) {
        this.location= location ;
        inventory = new ArrayList<String>();
    }
    public void calculateWorth(double price, int quantity) {

    }
}
