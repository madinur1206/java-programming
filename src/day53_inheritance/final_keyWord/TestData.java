package day53_inheritance.final_keyWord;

public final class TestData {
    // testdata class that has a list of constancs
    public static final String ADMIN_USERNAME= "admin";
    public static final String ADMIN_PASSWORD = "password123";
    public static final int MAX_WAIT_TIME= 60;
    public static final boolean STOP_IF_FAIL = true;
}
//class Child extends TestData {}// Error cannot inherit from final class
