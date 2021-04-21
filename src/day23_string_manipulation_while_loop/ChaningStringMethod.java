package day23_string_manipulation_while_loop;

public class ChaningStringMethod {
    public static void main(String[] args) {
        String word = "wooden spoon";
        System.out.println(word.toUpperCase().toLowerCase() .length() );
        System.out.println(word.replace(" ","").toUpperCase() );
        String city = "ISTANBUL";
        System.out.println(city.substring(0,1).toUpperCase() +city.substring(1).toLowerCase() );
    }
}
