public class Main {public static void main(String[] args) {
    
    System.out.println("--- 2D Shapes ---");
    Circle c = new Circle(6.0);
    System.out.println(c.toString());

    Square s = new Square(5.0);
    System.out.println(s.toString());

    Rectangle r = new Rectangle(2.0, 9.0);
    System.out.println(r.toString());


    System.out.println("\n--- 3D Shapes ---");
    Cylinder cyl = new Cylinder(1.0, 3.0);
    System.out.println("Cylinder Volume: " + cyl.getVolume());
    System.out.println("Cylinder Area: " + cyl.getArea());

    Sphere sph = new Sphere(5,4.0);
    System.out.println("Sphere Volume: " + sph.getVolume());

    Pyramid pyr = new Pyramid(5, 10, 5);
    System.out.println("Pyramid Volume: " + pyr.getVolume());

    Cone cone = new Cone(25.0, 3.0);
    System.out.println("Cone Volume: " + cone.getVolume());
}
}
