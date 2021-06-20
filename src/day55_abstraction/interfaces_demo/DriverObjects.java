package day55_abstraction.interfaces_demo;

public class DriverObjects {
    public static void main(String[] args) {
        ChromeDriver  driver1 = new ChromeDriver() ;
       FireFox  driver2 = new FireFox() ;
        WebDriver   driver3 = new ChromeDriver() ;
        driver1.get("https://google.com") ;
        driver1.findElement("//input[@name='q']") ;
        System.out.println("Title = "+ driver1.getTitle());



    }
}
