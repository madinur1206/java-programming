package day58_polymorphism;

public abstract class OnLineShop {
    public abstract void buy ();
    public abstract void sell ();
    public void ship () {
        System.out.println("shipping the purchased items");
    }
}
