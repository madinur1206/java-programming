package Practice;

public class Item {
    /*
    Create a class Item

    -> Instance variables:
        - name (String), price (double), quantity (int)

    -> Constructor:
        - Accepts and initializes all three variables

    -> Instance methods:
        - toString(): returns information about Item
     */
    String name;

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    double price;
    int quantity;

    public Item (String name,double price, int quantity) {
        this.name= name;
        this.price= price;
        this.quantity =quantity ;
        System.out.println("this is constructor");
    }
}
