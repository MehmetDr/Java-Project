public class Cylinder extends Shape3D{
    Cylinder(double height,double radius){
        super(height,radius);
    }

    @Override
    public double getVolume() {
        return PI * Math.pow(radius,2) * height;
    }

    @Override
    public double getArea() {
        return (2 * PI * radius * height)+ 2 * PI * Math.pow(radius,2);

    }

    @Override
    public String toString() {
        return "Cylinder [Radius,Height: "+radius+height+"Area: "+getArea();
    }
}
