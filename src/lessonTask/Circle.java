package lessonTask;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    protected double square() throws ShapeIncorrectException {
        if (radius > 0) {
            return (Math.PI) * radius * radius;
        } else {
            throw new ShapeIncorrectException("Not a circle");
        }
    }
}
