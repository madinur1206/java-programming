package day55_abstraction.interfaces_demo;

public class ChromeDriver  implements WebDriver {
    @Override
    public void get(String url) {
        System.out.println("Chromedriver navigating to "+url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("Chromedriver locating element by  "+locator );
    }

    @Override
    public void quit() {
        System.out.println("chrome driver is quitting ");
    }

    @Override
    public String getTitle() {
        return  "foundation";
    }
}
