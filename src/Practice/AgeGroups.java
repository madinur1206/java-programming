package Practice;
/*
Write a program that can define the age groups of a person.

Have a pre-condition(Outer if): if age > 120 or less than 0 ==> invalid entry, and nothing else is checked.

Age groups:
Infant (< 1 year), Toddler (3 - 5), Kid (6 - 9), Pre-Teen (10 - 12), Teenager (13 - 17), Young Adult (18 - 20), Adult (21 - 39), Young Middle-Aged Adult (40 - 49), Middle-Aged Adult (50 - 54), Very Young Senior Citizen (55 - 64), Young Senior Citizen (65 - 74), Senior Citizen (75 - 84), Old Senior Citizen (85+)

Based on the given age find and print which age group they are in.
 */
public class AgeGroups {
    public static void main(String[] args) {
        int age = 10;
        if (age > 120 || age < 0) {
            System.out.println("invalid entry, and nothing else is checked.");
        } else {
            if (age <= 2) {
                System.out.println("Infant");
            }
            if (age > 2 && age <= 5) {
                System.out.println("Toddler");
                if (age > 5 && age <= 9) {
                    System.out.println("Kid");
                    if (age > 9 && age <= 12) ;
                    System.out.println("Pre-Teen");
                    if (age > 12 && age <= 17) {
                        System.out.println("Teenager");
                        if (age > 17 && age <= 20) {
                            System.out.println("Young Adult");
                            if (age > 20 && age <= 39) {
                                System.out.println("Adult");
                                if (age > 39 && age <= 49) {
                                    System.out.println("Young Middle-Aged Adult");
                                    if (age > 49 && age <= 54) {
                                        System.out.println("Middle-Aged Adult");
                                        if (age > 54 && age <= 64) {
                                            System.out.println("Very young senior citizen");
                                            if (age > 64 && age <= 74) {
                                                System.out.println("Young senior citizen");
                                                if (age > 74 && age <= 84) {
                                                    System.out.println("Senior citizen");


                                                } else {
                                                    System.out.println("Old senior citizen");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
    }
}
