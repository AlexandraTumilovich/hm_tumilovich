package hw4.task2;

public class Box extends Shape {
    Box(double volume) {
        super.volume = volume;
    }

    boolean add(Shape shape) {
        if (shape.volume < this.volume) {
            this.volume -= shape.volume;
            System.out.println("New " + shape.getClass().getSimpleName() + " is added in the box. Empty volume is " + this.volume);
            return true;
        } else {
            System.out.println("New shape cannot be added.");
            return false;
        }
    }
}
