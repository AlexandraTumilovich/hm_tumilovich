package hw2;
/*
Дано натуральное число n>1. Используя рекурсию, необходимо проверить, является ли оно простым.
Программа должна вывести фразу «Is number <your number> simple - YES»,
если число простое и «Is number <your number> simple - NO», если число составное.
Для вывода информации используйте метод printf.

 */

import java.util.Scanner;

public class HW2_8 {
    public static void main(String[] args) {
        checkNumber(getNumber(), 2);

    }

    public static void checkNumber(int number, int a) {
        if (number == 2) {
            System.out.printf("Is number %d simple - YES", number);
        } else if (number % a == 0) {
            System.out.printf("Is number %d simple - NO", number);
        } else if (a < number / 2) {
            checkNumber(number, a + 1);
        } else {
            System.out.printf("Is number %d simple - YES", number);
        }
    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное целое число больше 1");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number > 1) {
                return number;
            } else {
                System.out.println("Вы ввели неверное число");
                return getNumber();
            }
        } else {
            System.out.println("Вы ввели неверное число");
            return getNumber();
        }
    }
}
