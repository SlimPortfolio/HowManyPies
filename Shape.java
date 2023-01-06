public class Shape {
    double area;
    int numberOfSlices;
    String pizzaShape;
    double avgAreaPerPerson = (3*49*3.14)/8;


    Shape(){
        System.out.println("---New Pizza Made---");
    }

    public void printArea(){
        System.out.println("area is " + area);
    }

    public double areaPerSlice(){
        double result = area/numberOfSlices;
        return result;
    }

    public int slicesNeeded(){
        int slicesNeeded = 0;
        slicesNeeded = (int)Math.ceil(avgAreaPerPerson / areaPerSlice());
        return slicesNeeded;
    }
    
    public int numberFed(){
        int numberFed = (int)Math.floor(numberOfSlices / slicesNeeded());
        return numberFed;

    }

    public void report(){
        if(areaPerSlice() >= avgAreaPerPerson){
            System.out.println("ERROR: Dimensions are too big, each slice can feed a person or more.");
            System.out.println("---End Report---\r");
            return;
        }
        System.out.println("Pizza Shape: " + pizzaShape);
        System.out.println("Number of People Fed: " + numberFed());
        System.out.println("Number of Slices Per Person: " + slicesNeeded());
        int extraSlices = (int)(numberOfSlices - numberFed() * slicesNeeded());
        System.out.println("Extra Slices " + extraSlices);
        System.out.println("---End Report---\r");
    }

}
