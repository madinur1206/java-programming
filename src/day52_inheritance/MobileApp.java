package day52_inheritance;

public class MobileApp {
    String name;
    double version;
    protected boolean download () {
        System.out.println("APP: "+ name +" version: "+version +"was downloaded");
        return true;
    }

    public void UseTheApp (int minutes) {
        System.out.println("Using "+name +"app for"+minutes +"minutes");
    }
}
