public class Cone extends Shape3D{
    Cone(double height,double radius){
        super(height, radius);
    }

    @Override
    public double getVolume() {
        return (1.0/3.0)*PI*(radius*radius)*height;
    }

    @Override
    public double getArea() {
        double slantHeight = Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2));
        return PI * radius * (radius + slantHeight);
    }

    @Override
    public String toString() {
        return "Cone [Radius,Height: "+radius+height+"Area: "+getArea();
    }
}
