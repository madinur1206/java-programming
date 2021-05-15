package day44_custom_classes;

public class MyApp {
    public static void main(String[] args) {
        App uberApp = new App();
        uberApp .appName ="uber";
        uberApp .version =3.5;
        System.out.println(uberApp .appName );
        uberApp .open() ;
    }
}
