package hw2;

import java.util.Scanner;

/*
В векторе, состоящем из n вещественных элементов,
вычислить: сумму отрицательных элементов вектора и произведение элементов вектора,
расположенных между максимальным и минимальным элементами.
(Введем n из консоли (n<=20), а массив заполним числами от -20 до 20, включительно)
*/

public class HW2_4 {

    public static int numberOfElements; // количество элементов в векторе

    public static void main(String[] args) {
        getNumber(); // для получения количества элементов в массиве
        int[] myArray = new int[numberOfElements];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 41 - 20);
        }
        //System.out.println("Созданный массив:");
        for (int value : myArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nCумма отрицательных элементов вектора: " + getSum(myArray));
        System.out.println("Произведение элементов массива,  расположенных между максимальным и минимальным элементами: " + getproduct(myArray));

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

    public static int getSum(int[] someArray) {     //метод для нахождения суммы отрицательных элементов вектора
        int negElemSum = 0;
        for (int value : someArray) {
            if (value < 0) negElemSum += value;
        }
        return negElemSum;
    }

    public static long getproduct(int[] someArray) {
        int minNumber = someArray[0]; //Минимальное число в массиве
        int minIndex = 0;//Индекс минимального числа в массиве
        int maxNumber = someArray[0];// Максимальное число в массиве
        int maxIndex = 0; // Индекс максимального числа в массиве
        long productMinMax; // Произведение элементов массива,  расположенных между максимальным и минимальным элементами
        for (int i = 1; i < someArray.length; i++) { // Нахождение минимального числа в массиве
            if (minNumber > someArray[i]) {
                minNumber = someArray[i];
                minIndex = i;
            }
            if (maxNumber < someArray[i]) { // Нахождение максимального числа в массиве
                maxNumber = someArray[i];
                maxIndex = i;
            }
        }
        if (minIndex < maxIndex) {
            if ((maxIndex - minIndex) > 1) { // Проверка на случай, если макс и мин элементы стоят рядом
                productMinMax = someArray[minIndex + 1];
                for (int i = (minIndex + 2); i < maxIndex; i++) { // Перемножение чисел, начиная с числа после минимального до числа перед максимальным
                    productMinMax *= someArray[i];
                }
            } else {
                productMinMax = 0; // мин и макс элементы стоят рядом и между ними других элементов нет
            }
        } else {
            if ((minIndex - maxIndex) > 1) { // Проверка на случай, если макс и мин элементы стоят рядом
                productMinMax = someArray[maxIndex + 1];
                for (int i = (maxIndex + 2); i < minIndex; i++) { // Перемножение чисел, начиная с числа после максимального до числа перед минимальным
                    productMinMax *= someArray[i];
                }
            } else {
                productMinMax = 0; // макс и мин элементы стоят рядом и между ними других элементов нет
            }

        }
        return productMinMax;
    }
}
