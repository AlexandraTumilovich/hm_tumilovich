package hw2;

import java.util.Scanner;

/*
Создать и заполнить массив случайными числами, отсортировать массив по возрастанию, используя метод сортировки пузырьком.
 */
public class HW2_5 {
    public static int numberOfElements; // количество элементов в

    public static void main(String[] args) {
        getNumber();
        int[] myArray = fillArray(numberOfElements);
        printArray(myArray, "Массив до сортировки:");
        bubbleSortArray(myArray);
        printArray(myArray, "Массив после сортировки:");


    }

    public static void getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве (не более 20)");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number <= 20 && number > 0) {
                numberOfElements = number;
            } else {
                System.out.println("Вы ввели неверное число");
                getNumber();
            }

        } else {
            System.out.println("Вы ввели неверное число");
            getNumber();
        }
    }

    public static int[] fillArray(int arrayLength) { // метод для создания массива определенной длинны (arrayLength) случайными числами от [-20 до 20]
        int[] newArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            newArray[i] = (int) (Math.random() * 41 - 20);
        }
        return newArray;
    }

    public static void printArray(int[] someArray, String message) {
        System.out.println(message);
        for (int value : someArray) {
            System.out.print(value + " ");
        }
        System.out.println(" ");
    }

    public static void bubbleSortArray(int[] notSortedArray) {
        for (int i = (notSortedArray.length - 1); i >= 1; i--) {

            for (int j = 0; j < i; j++) {
                if (notSortedArray[j] > notSortedArray[j + 1]) {
                    int bubble = notSortedArray[j];
                    notSortedArray[j] = notSortedArray[j + 1];
                    notSortedArray[j + 1] = bubble;
                }

            }

        }
    }
}
