package hw4.task3;

public class Program {
    public static void main(String[] args) {
        int a = 100; // переведем это число в разные шкалы
        CelsiusConverter c = new CelsiusConverter();
        FahrenheitConverter f = new FahrenheitConverter();
        KelvinConverter k = new KelvinConverter();
        System.out.println("Celsius: " + c.convertToCelsius(a) + ", Fahrenheit: " + c.convertToFahrenheit(a) + ", Kelvin: " + c.convertToKelvin(a));
        System.out.println("Fahrenheit: " + f.convertToFahrenheit(a) + ", Celsius: " + f.convertToCelsius(a) + ", Kelvin: " + f.convertToKelvin(a));
        System.out.println("Kelvin: " + k.convertToKelvin(a) + ", Celsius: " + k.convertToCelsius(a) + ", Fahrenheit: " + k.convertToFahrenheit(a));
    }
}
