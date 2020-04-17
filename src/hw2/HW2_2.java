package hw2;

import java.util.Scanner;

public class HW2_2 {
    public static void main(String[] args) {
        /*
        Имеется целое число n < 10.
        Вывести какому дню недели оно соответствует, если при n = 1 день недели = Понедельник.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число n меньше 10 и больше 0: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n < 10 && n > 0) {
                switch (n) {
                    case 1:
                        System.out.println("Понедельник");
                        break;
                    case 2:
                        System.out.println("Вторник");
                        break;
                    case 3:
                        System.out.println("Среда");
                        break;
                    case 4:
                        System.out.println("Четверг");
                        break;
                    case 5:
                        System.out.println("Пятница");
                        break;
                    case 6:
                        System.out.println("Суббота");
                        break;
                    case 7:
                        System.out.println("Воскресенье");
                        break;
                    case 8:
                    case 9:
                        System.out.println("Такого дня нет");
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("Вы ввели неправильное число");
            }
        } else {
            System.out.println("Вы не ввели целое число.");
        }
    }
}
