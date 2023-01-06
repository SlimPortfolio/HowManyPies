public class Rectangle extends Shape{
    private double length;
    private double width;

    private double getArea(){
        double area = length*width;
        return area;
    }

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        this.numberOfSlices = 12;
        this.pizzaShape = "Rectangle";
        this.area = getArea();
    }
}
