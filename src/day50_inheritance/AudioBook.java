package day50_inheritance;

public class AudioBook extends Book {
    int length;
    String narrator;
    public void listen () {
        System.out.println("listening to  Audio-book");
        System.out.println("length = " + length);


    }
}
