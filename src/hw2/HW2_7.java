package hw2;

/*
Создать зубчатый (рваный) двумерный массив, заполненный случайными числами, вывести его элементы на экран.
Каждая строка зубчатого двумерного массива должны быть произвольной длины.
Длина строки должна выбираться случайно. Использовать класс Random или Math.random().
 */
public class HW2_7 {
    public static void main(String[] args) {

        int[][] myArray = createArray();
        printDoubleArray(myArray);

    }

    public static int[][] createArray() { // метод для создания рваного двумерного массива
        int a = (int) (Math.random() * 11 + 1); // генерация рандомного числа a от [1 до 10]
        int[][] newArray = new int[a][]; // создание массива с числом строк a
        for (int i = 0; i < newArray.length; i++) {
            int b = (int) (Math.random() * 11 + 1); // генерация рандомного числа b от [1 до 10]
            newArray[i] = new int[b]; // заполнение строк массивами с количеством эллементов=b
            for (int j = 0; j < b; j++) {
                newArray[i][j] = (int) (Math.random() * 41 - 20); // заполнение столбцов случайными числами [от -20 до 20]
            }
        }
        return newArray;
    }

    public static void printDoubleArray(int[][] doubleArray) { // метод для выведения двумерного массива в консоль
        for (int[] ints : doubleArray) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }

        }
    }
}
