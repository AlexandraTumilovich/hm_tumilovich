package hw4.task2;

public class Pyramid extends Shape {
    double s;
    double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
        super.volume = s * h / 3;
    }
}
