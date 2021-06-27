package day57_abstraction_polymorhism.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle() ;
        triangle.draw() ;
        Shape circle= new Circle() ;
        circle.draw() ;
        Shape square= new Square() ;
        square .draw() ;
        List<Shape> allShapes = new ArrayList<>() ;
        allShapes .add(new Triangle() ) ;
        allShapes .add(new Square() );
        allShapes .add(new Circle() );
        allShapes .add(new Triangle() ) ;
        allShapes .add(new Square() );
        allShapes .add(new Circle() );
        allShapes .add(new Triangle() ) ;
        allShapes .add(new Square() );
        allShapes .add(new Circle() );
        allShapes .add(new Circle() );


        for (Shape eachShape : allShapes) {

            eachShape .draw() ;
        }
        drawShape(new Circle()) ;
        drawShape(new Square() ) ;
        drawShape(triangle) ;

    }
    /**
     * static method :drawShape
     * accepts objects of shape
     * then call draw method
     */

    public static void drawShape (Shape shape) {
        System.out.println("drawing shapes ....");
        shape.draw() ;
    }


}
