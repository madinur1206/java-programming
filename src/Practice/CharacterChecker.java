package Practice;

public class CharacterChecker {
    public static void main(String[] args) {
        char letter='0';
        int number =121;
        if(number>=65&&number<=90){
            System.out.println(letter +" -Upper case");
        }else if(number>=97&&number<=122){
            System.out.println(letter+" -Lower case");
        }else{
            System.out.println("Invalid entry");
        }
    }
}
