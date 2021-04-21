package Practice;

import java.util.Scanner;

public class PersonalInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people do you live with? ");
        int people = scan.nextInt();
        if (people <= 2 && people >= 0) {
            System.out.println("Live with less than 2 people");
        } else if (people >= 3 && people <= 6) {
            System.out.println("Live with 3 - 6 people");
        } else if (people > 6) {
            System.out.println("more than 6 people");
        } else {
            System.out.println("Invalid entry");
        }
        System.out.println("what city do you live? ");

        String city = scan.next();
        System.out.println("Do you live in downtown?");
        String isDowntown = scan.next();
        if(isDowntown .equals("yes")) {
            System.out.println("Have you thought about moving to the suburbs? ");
        }
        String answer = scan.next();
        if (answer.equals("yes")) {
            System.out.println("DO it, it is great");
        } else {
            System.out.println("You should think about it");
        }

        System.out.println("what's your favorite animal?");
        String animal = scan.next();
        System.out.println("wow "+ animal +" is a great animal");
        System.out.println("How many pets do you want?");
        int numberOfPets= scan.nextInt();
        System.out.println("Interesting, do you want "+numberOfPets +animal +"?");

    }

}


