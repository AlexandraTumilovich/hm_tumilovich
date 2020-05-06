package hw4.task3;

public class FahrenheitConverter implements Converter {
    // Перевод градусов Фаренгейта в другие шкалы

    @Override
    public double convertToCelsius(double value) {
        // из Фаренгейта в градусы Цельсия
        return ((value - 32) / 1.8);
    }

    @Override
    public double convertToFahrenheit(double value) {
        // возвращаем тоже значение в Фаренгейтах
        return value;
    }

    @Override
    public double convertToKelvin(double value) {
        // Из Фаренгейта в Кельвины
        return ((value + 459.67) * 5 / 9);
    }
}
