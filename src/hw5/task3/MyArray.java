package hw5.task3;

public class MyArray<T> {
    private T[] arr;

    public MyArray(T[] arr) {
        this.arr = arr;
    }

    public T getElement(int number) {
        return arr[number];
    }
}
