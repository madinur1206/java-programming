package OfficeHours.practice_6_08_2021;

public class Rectangle extends Shape  {
    double length;
    double width;

    @Override
    public void calculateArea() {
        area= length *width ;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public void calculatePerimeter() {
       perimeter = 2*(length+width );
    }
}
