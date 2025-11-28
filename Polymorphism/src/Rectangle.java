public class Rectangle extends Shape2D{
    Rectangle(double height,double width){
        super(height,width);
    }

    @Override
    public double getArea() {
        return height*width;
    }

    @Override
    public String toString() {
        return "Rectangle [Height,Width: "+height+width+ "Area: "+getArea();
    }
}
