package day51_inheritance.super_keyword;

public class Lux extends Lyft  {
    @Override
    public double CalculateRate  (double miles) {

        return super.CalculateRate(miles)*1.2;

    }
}

