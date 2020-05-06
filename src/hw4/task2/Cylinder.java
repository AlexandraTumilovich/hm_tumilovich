package hw4.task2;

public class Cylinder extends SolidOfRevolution {
    double height;

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        super.volume = (Math.PI) * radius * radius * height;
    }
}
