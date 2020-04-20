package hw3.task2;

/*
Создайте класс Calculator, который будет производит математические действия над двумя операндами и выводить результат операций в консоль.
В классе должны быть:
- поля-операнды
- геттеры и сеттеры для полей
- конструктор, в котором инициализируются поля
- методы для математических операций (не менее трех операций).

Протестируйте работу Вашего класса.
 */

public class Calculator {
    double firstNumber;
    double secondNumber;

    public Calculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void getSum() { // Метод для сложения двух чисел (поля класса)
        double sum = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
    }

    public void getDifference() { // Метод для вычитания двух чисел (поля класса)
        double difference = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
    }

    public void getProduct() { // Метод для умножения двух чисел (поля класса)
        double product = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + product);
    }

    public void getQuotient() { // Метод для деления одного числ на другое (поля класса)
        double quotient = firstNumber / secondNumber;
        System.out.println(firstNumber + " / " + secondNumber + " = " + quotient);
    }
}