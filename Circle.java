public class Circle extends Shape{
    private double diameter;

    private double getArea(){
        double radius = diameter/2;
        double area = 3.14*radius*radius;
        return area;
    }

    Circle(int diameter){
        this.diameter = diameter;
        this.numberOfSlices = 8;
        this.pizzaShape = "Circle";
        this.area = getArea();
    }
}
