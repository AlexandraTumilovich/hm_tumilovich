package hw4.task3;

public class KelvinConverter implements Converter {
    // Перевод Кельвинов в другие шкалы

    @Override
    public double convertToCelsius(double value) {
        // из Кельвина в градусы Цельсия
        return (value - 273.15);
    }

    @Override
    public double convertToFahrenheit(double value) {
        // Из Кельвина в Фаренгейты
        return (1.8 * (value - 273) + 32);
    }

    @Override
    public double convertToKelvin(double value) {
        // возвращаем тоже значение в Кельвинах
        return value;
    }
}
