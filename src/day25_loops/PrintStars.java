package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        for(int stars=1;stars<=15;stars ++) {
            System.out.print("* ");
        }
        String myStars= "";

        for(int num=1;num<=5; num++){
            myStars +="* ";
        }
        System.out.println("myStars = " + myStars);

    }
}
