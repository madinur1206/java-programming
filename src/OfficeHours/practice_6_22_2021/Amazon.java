package OfficeHours.practice_6_22_2021;

/*
Create a concrete class Amazon
- Inherit OnlineShopping and implement all abstract methods

 */
public class Amazon extends OnlineShopping implements AllowUsersToSell  {
    @Override
    public void viewCart() {
        System.out.println("viewing amazon cart");
    }

    @Override
    public boolean payForShipping(double price) {
        if (price > 50) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void buyItem() {
        System.out.println("Buying item");
    }

    @Override
    public void returnItem() {

    }

    @Override
    public void uploadProduct() {

    }
}
