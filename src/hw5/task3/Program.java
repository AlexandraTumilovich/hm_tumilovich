package hw5.task3;

public class Program {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5, 6};
        String[] arr2 = {"qwe", "wer", "ert"};
        Byte[] arr3 = {2, 4, 6, 8, 0};
        Short[] arr4 = {10, 20, 30, 40, 50};
        Double[] arr5 = {1.5, 2.5, 3.5, 4.5};
        Float[] arr6 = {1.01f, 2.02f, 3.03f, 4.04f};
        Character[] arr7 = {'q', 'w', 'e', 'r', 't', 'y'};

        // Создадим объекты MyArray для разных типов данных
        MyArray<Integer> myArr1 = new MyArray<>(arr1);
        MyArray<String> myArr2 = new MyArray<>(arr2);
        MyArray<Byte> myArr3 = new MyArray<>(arr3);
        MyArray<Short> myArr4 = new MyArray<>(arr4);
        MyArray<Double> myArr5 = new MyArray<>(arr5);
        MyArray<Float> myArr6 = new MyArray<>(arr6);
        MyArray<Character> myArr7 = new MyArray<>(arr7);

        // Выведем в консоль элементы массивов
        System.out.println(myArr1.getElement(0));
        System.out.println(myArr2.getElement(1));
        System.out.println(myArr3.getElement(2));
        System.out.println(myArr4.getElement(0));
        System.out.println(myArr5.getElement(2));
        System.out.println(myArr6.getElement(1));
        System.out.println(myArr7.getElement(2));
    }
}
