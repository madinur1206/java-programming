package day58_polymorphism;

public class Amazon extends OnLineShop implements Prime   {
    @Override
    public void buy() {
        System.out.println("Buying items on amazon.com");
    }

    @Override
    public void sell() {
        System.out.println("Selling items on amazon.com");

    }

    @Override
    public void primeShopping() {
        System.out.println("Free _2 day shipping for prime user");

    }
}
