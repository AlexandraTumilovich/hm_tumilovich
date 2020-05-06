package hw4.task3;

public class CelsiusConverter implements Converter {
    // Перевод градусов Цельсия в другие шкалы

    @Override
    public double convertToCelsius(double value) {
        // возвращаем тоже значение в градусах Цельсия
        return value;
    }

    @Override
    public double convertToFahrenheit(double value) {
        // Из Цельсия в Фаренгейты
        return (value * 1.8 + 32);
    }

    @Override
    public double convertToKelvin(double value) {
        // Из Цельсия в Кельвины
        return value + 273.15;
    }
}
