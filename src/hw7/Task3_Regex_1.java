package hw7;

import java.util.Scanner;

public class Task3_Regex_1 {
    public static String REGEX_IP = "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
    public static String REGEX_DATE = "^([0-9]{4})/([0][0-9])|([1][0-2])/([0-2][0-9])|([3][0-1])\\s([0-1][0-9]|[2][0-3]):([0-5][0-9]):([0-5][0-9])$";
    public static String REGEX_URL = "^((http://)|(https://))([a-zA-Z0-9-_]+\\.)*[a-zA-Z0-9][a-zA-Z0-9-_]+\\.[a-zA-Z]{2,11}[/]?$";

    /*
    Составить регулярное выражение, определяющее, является ли заданная строка IP адресом, записанным в десятичном виде.
– пример правильных выражений: 127.0.0.1, 255.255.255.0.
– пример неправильных выражений: 1300.6.7.8, abc.def.gha.bcd.

Ввести дату из консоли и проверить, что она соответствует формату YYYY/MM/DD HH:MM:SS.
Например: 2019/11/15 13:00:00.

Проверить доменные имена для протоколов http и https на правильность.
http://example.com/ - верный формат адреса.
example.com – неверный/
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        choice(scanner);
    }

    public static void testIP(Scanner scanner) {
        while (true) {
            System.out.println("Введите ip адрес для проверки. Для выхода из программы введите \"exit\"");
            String testLine = scanner.nextLine();
            if (testLine.equals("exit")) {
                System.out.println("Проверка ip адреса завершена.");
                break;
            } else {
                if (testLine.matches(REGEX_IP)) {
                    System.out.println("ip адрес " + testLine + " - правильный.");
                } else {
                    System.out.println("ip адрес " + testLine + " - неправильный. Попробуйте другой.");
                }
            }
        }
    }

    public static void testDate(Scanner scanner) {
        while (true) {
            System.out.println("Введите дату для проверки. Для выхода из программы введите \"exit\"");
            String testLine = scanner.nextLine();
            if (testLine.equals("exit")) {
                System.out.println("Проверка даты завершена.");
                break;
            } else {
                if (testLine.matches(REGEX_DATE)) {
                    System.out.println("Дата " + testLine + " - правильная.");
                } else {
                    System.out.println("Дата " + testLine + " - неправильная. Попробуйте другую.");
                }
            }
        }
    }

    public static void testURL(Scanner scanner) {
        while (true) {
            System.out.println("Введите доменное имя для проверки. Для выхода из программы введите \"exit\"");
            String testLine = scanner.nextLine();
            if (testLine.equals("exit")) {
                System.out.println("Проверка доменного имени завершена.");
                break;
            } else {
                if (testLine.matches(REGEX_URL)) {
                    System.out.println("Доменное имя " + testLine + " - правильное.");
                } else {
                    System.out.println("Доменное имя " + testLine + " - неправильное. Попробуйте другое.");
                }
            }
        }
    }

    public static void choice(Scanner scanner) {
        System.out.println("Выберите, что вы хотите проверить:" +
                "\n1 - ip адрес\n2 - формат даты\n3 - URL строку\n4 - закрыть программу");
        switch (scanner.nextLine()) {
            case "1":
                testIP(scanner);
                choice(scanner);
                break;
            case "2":
                testDate(scanner);
                choice(scanner);
                break;
            case "3":
                testURL(scanner);
                choice(scanner);
                break;
            case "4":
                System.out.println("Программа завершена.");
                break;
            default:
                System.out.println("Неверный ввод.");
                choice(scanner);
        }
    }
}
