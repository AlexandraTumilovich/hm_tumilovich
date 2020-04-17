package hw2;

import java.util.Scanner;

/*
Создать двумерный массив, размером n x n (размер массива вводить с консоли). Если элемент массива является четным числом, вывести 0, если не четным 1. Использовать циклы.
Пример вывода:
01001
01011
11100
00100
10101
 */
public class HW2_6 {
    public static void main(String[] args) {
        int[][] doubleArray = fillArray(getNumber());
        System.out.println("Первый массив:");
        printDoubleArray(doubleArray);
        int[][] binaryArray = createBinaryArray(doubleArray);
        System.out.println("\nВторой массив");
        printDoubleArray(binaryArray);
    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве (не более 20)");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number <= 20 && number > 0) {
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

    public static int[][] fillArray(int arrayLength) { // метод для заполнения двухмерного массива числами от -20 до 20
        int[][] newArray = new int[arrayLength][arrayLength];
        for (int i = 0; i < arrayLength; i++) {

            for (int j = 0; j < arrayLength; j++) {
                newArray[i][j] = (int) (Math.random() * 41 - 20);
            }
        }
        return newArray;
    }

    public static int[][] createBinaryArray(int[][] oldArray) { // метод для замены чисел в массиве, четных на 0, нечетных на 1
        int[][] binaryArray = new int[oldArray.length][oldArray.length];
        for (int i = 0; i < oldArray.length; i++) {

            for (int j = 0; j < oldArray.length; j++) {
                if (oldArray[i][j] % 2 == 0) {
                    binaryArray[i][j] = 0;
                } else {
                    binaryArray[i][j] = 1;
                }
            }
        }
        return binaryArray;
    }

    public static void printDoubleArray(int[][] doubleArray) { // Метод для вывода двумерного массива в консоль
        for (int[] ints : doubleArray) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
