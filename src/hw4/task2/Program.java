package hw4.task2;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        // Создадим массив разных фигур
        ArrayList<Shape> array = new ArrayList<>();
        array.add(new Ball(5));
        array.add(new Cylinder(5, 4));
        array.add(new Pyramid(27, 5));
        array.add(new Ball(4));
        array.add(new Cylinder(2, 4));
        array.add(new Pyramid(10, 7));

        // Создадим коробку и заполним ее
        Box box1 = new Box(1000);
        System.out.println("First box:");
        boxFilling(array, box1);

        // Создадим коробку побольше, чтобы все влезло
        Box box2 = new Box(3000);
        System.out.println("\nSecond box:");
        boxFilling(array, box2);
    }

    public static void boxFilling(ArrayList<Shape> array, Box box) { // метод заполнения любой коробки любым массивом объектов
        for (int i = 0; i < array.size(); i++) {
            if (!box.add(array.get(i))) { // цикл прервется как только один из предметов не влезет в коробку
                break;
            }
            if (i == (array.size() - 1)) {
                System.out.println("All objects are in the box!"); // Если все предметы поместились в коробку
            }
        }
    }
}
