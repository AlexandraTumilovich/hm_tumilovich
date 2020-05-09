package hw5.task2;

public class Program {
    public static void main(String[] args) {
        // Проверим позицию некоторых букв (больших и маленьких) в алфавите
        Letters.A.getLetterPosition();
        Letters.a.getLetterPosition();
        Letters.B.getLetterPosition();
        Letters.m.getLetterPosition();
        Letters.X.getLetterPosition();
        Letters.Z.getLetterPosition();

        // Выведем весь алфавит
        Letters.printAll();
    }
}
