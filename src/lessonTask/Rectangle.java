package lessonTask;

public class Rectangle extends Shape {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    protected double square() throws ShapeIncorrectException {
        if (a > 0 && b > 0) {
            return a * b;
        } else {
            throw new ShapeIncorrectException("Not a rectangle");
        }
    }
}
