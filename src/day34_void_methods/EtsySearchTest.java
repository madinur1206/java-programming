package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("---Starting Etsy search chrome smoke Test ---");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        System.out.println("--Search Completed--");

    }
    public static void openBrowser() {
        System.out.println(" Launching chrome browser");

    }
    public static void navigateToEtsyUrl() {
        System.out.println("Navigating to http://www.etsy.com/");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("pass: verify Etsy home page is displayed");
    }

}
