package lessonTask;

public class Program {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Triangle t1 = new Triangle(1, 0, 3); // Не треугольник, одно из значений - нулевое
        Rectangle r1 = new Rectangle(1, 6);
        try {
            System.out.println("Circle: " + c1.square() + " , Triangle" + t1.square() + " , Rectangle" + r1.square());
        } catch (ShapeIncorrectException e) {
            e.printStackTrace();
        }
    }
}
