package Practice;

public class Rectangle {
    double width;
    double height;
    double area;



    public void setDimensions(double newWidth, double newHeight ){
        width=newWidth ;
        height = newHeight ;
        area= width *height  ;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + area +
                '}';
    }

    public double getArea() {
        return area;
    }
}
