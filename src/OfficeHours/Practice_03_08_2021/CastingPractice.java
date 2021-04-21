package OfficeHours.Practice_03_08_2021;

public class CastingPractice {
    public static void main(String[] args) {
        byte b = 10;
        short s = b;
        byte b2 = (byte)s;
        double d = 5.3;
        int i = (int)d ;
        int i2 = (short)d;
        System.out.println(i);
        System.out.println((double)i);
        float f =3;
        float f2 = 3.54f;
        float f3 = (float)3.54;// float = (float)double
        float f4 = 5;// float = int - 5.0
        float f5 = 5.5f;// float = double
        long l = 22313; // long = int
        long l2 = 43567889999l;
        double million = 1_000_000;
        System.out.println(million );
    }
}
