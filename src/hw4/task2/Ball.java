package hw4.task2;

public class Ball extends SolidOfRevolution {
    Ball(double radius) {
        super(radius);
        super.volume = (Math.PI) * radius * radius * radius * 4 / 3;
    }
}
