package Practice;

public class replaceCharacters {
    public static void main(String[] args) {
        String message = "java class is fun";
        int number = 1;
        switch ( number  ){
            case 1:
                System.out.println(message .replace("a","e"));
                break;
            case 2:
                System.out.println(message .replace("s","r"));
                break;
            case 3:
                System.out.println(message .replace("o","z"));
        }
    }
}
