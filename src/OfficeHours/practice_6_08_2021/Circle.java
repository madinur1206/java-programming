package OfficeHours.practice_6_08_2021;

public class Circle  extends Shape {
    double radius;
    double diameter= radius*2;

    @Override
    public void calculateArea() {
       area= Math.PI *radius *radius ;
       //Math.pow(radius,2)
    }


    @Override
    public String toString() {
        return "Circle{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

    @Override
    public void calculatePerimeter() {
        super.calculatePerimeter();
    }
}
