public class Triangle extends Shape {
    private double base;
    private double height;

    private double getArea(){
        double area = 0.5*this.base*this.height;
        return area;
    }

    Triangle(int sideLength){
        this.base = sideLength;
        this.height = (sideLength*Math.sqrt(3))/2;
        this.numberOfSlices = 4;
        this.pizzaShape = "Triangle";
        this.area = getArea();
    }

    

}
