package OfficeHours.practice_6_08_2021;

public class Shape {
    double area;
    double perimeter;

    public void calculateArea () {
        System.out.println("shape area");
    }

    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

    public void calculatePerimeter () {
        System.out.println("shape perimeter");
    }
}
