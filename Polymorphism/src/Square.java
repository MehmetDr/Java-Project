public class Square extends Shape2D{
    Square(double width){
        super(width,width);
    }

    @Override
    public double getArea() {
        return (width * width);
    }

    @Override
    public String toString() {
        return "Square [Width: "+width+"Area: "+getArea();
    }
}
