public class Pyramid extends Shape3D{
    Pyramid(int depth,int height,int width){
        super(depth,height,width);
    }

    @Override
    public double getVolume() {
        return (width*depth*height)/3.0;
    }

    @Override
    public double getArea() {
        double baseArea = width * depth;
        double slantHeight1 = Math.sqrt(Math.pow(height, 2) + Math.pow(width/2.0, 2));
        double slantHeight2 = Math.sqrt(Math.pow(height, 2) + Math.pow(depth/2.0, 2));
        double lateralArea = (width * slantHeight2) + (depth * slantHeight1);
        return baseArea + lateralArea;
    }

    @Override
    public String toString() {
        return "Pyramid [Height,Width,Depth: "+height+width+depth+ "Area: "+getArea();
    }
}
