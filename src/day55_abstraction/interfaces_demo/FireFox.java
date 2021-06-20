package day55_abstraction.interfaces_demo;

public class FireFox  implements WebDriver {

    @Override
    public void get(String url) {
        System.out.println("FirefoxDriver -navigating to "+url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("Chromedriver locating element by  "+locator);
    }

    @Override
    public void quit() {
        System.out.println("firefox driver is quitting ");
    }

    @Override
    public String getTitle() {
        return  "wooden spoon";
    }
}
