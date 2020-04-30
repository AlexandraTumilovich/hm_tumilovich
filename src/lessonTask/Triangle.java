package lessonTask;

public class Triangle extends Shape  {
    private int side1;
    private int side2;
    private int side3;
    private double p;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    protected double square() throws ShapeIncorrectException{
        if (side1>0&&side2>0&&side3>0){
            p = (side1+side2+side3)/2;
            return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        } else {
            throw new ShapeIncorrectException("Not a triangle");
        }
    }
}
