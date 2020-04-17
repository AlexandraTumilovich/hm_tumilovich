package hw2;

import java.util.Scanner;

public class HW2_1 {

    public static void main(String[] args) {
        /*
        Имеется прямоугольное отверстие размерами a и b.
        Определите можно ли его полностью закрыть круглой картонкой радиусом r.
        Вывести результат на экран.
        Данные a, b и r ввести с консоли.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a: ");
        int a = scanner.nextInt();
        System.out.println("Введите b: ");
        int b = scanner.nextInt();
        System.out.println("Введите r: ");
        int r = scanner.nextInt();
        if (r >= ((Math.sqrt(a * a + b * b)) / 2)) {
            System.out.printf("Круг с радиусом %d закрывает прямоугольник cо сторонами %d и %d", r, a, b);
        } else {
            System.out.printf("Круг с радиусом %d НЕ 2закрывает прямоугольник cо сторонами %d и %d", r, a, b);
        }

    }

}
