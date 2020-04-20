package hw3.task2;

public class Program {
    public static void main(String[] args) {
        // Тестирование класса Calculator
        Calculator calc1 = new Calculator(12, 5);
        calc1.getSum(); // Сложение
        calc1.getDifference(); // Вычитание
        calc1.getProduct(); // Умножение
        calc1.getQuotient(); // Деление
        calc1.setFirstNumber(15); // Изменение первого числа
        calc1.setSecondNumber(7); // Изменение второго числа
        System.out.println("Первое число: " + calc1.getFirstNumber() + "\n" + "Второе число: " + calc1.getSecondNumber()); // Выведение первого и второго числа после изменения
    }
}
