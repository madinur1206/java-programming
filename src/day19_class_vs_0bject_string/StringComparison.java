package day19_class_vs_0bject_string;

public class StringComparison {
    public static void main(String[] args) {

        String city ="Ottawa";
        System.out.println(city.equals("Ottawa"));
        System.out.println(city.equals("ottawa"));
        System.out.println(city.equalsIgnoreCase("Ottawa") );
        System.out.println(city.equalsIgnoreCase("ottawa"));
    }

}
