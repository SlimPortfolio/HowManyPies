import java.lang.Math;

public class Main{

    public static void main(String[] args){
        Triangle newTriangle = new Triangle(15);
        newTriangle.report();
        Circle newCircle = new Circle(14);
        newCircle.report();
        Rectangle newRectangle = new Rectangle(12, 10);
        newRectangle.report();
    }
}
