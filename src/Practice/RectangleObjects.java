package Practice;


public class RectangleObjects {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle() ;
        rectangle.setDimensions(1.1,1.2);
        System.out.println(rectangle.toString());
        System.out.println(rectangle .getArea() );
    }
}
