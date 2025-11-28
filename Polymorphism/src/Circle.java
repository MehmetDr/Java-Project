public class Circle extends Shape2D{
    Circle(double radius){
        super(radius);
    }

    @Override
    public double getArea() {
        return PI*(radius*2);
    }

    @Override
    public String toString() {
        return "Circle [Radius: "+radius+"Area: "+getArea();
    }
}
