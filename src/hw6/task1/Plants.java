package hw6.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Plants {
    private Map<String, String> fruitDescription;
    private Map<String, String> fruitExample;

    {
        fruitDescription = new HashMap<>();
        fruitDescription.put("Листовка", "образована одним плодолистиком и раскрывается одним швом. Если в цветке много пестиков, то тогда листовки из одного пестика составляют единый плод — многолистовку.");
        fruitDescription.put("Боб", "одногнездный плод, образован одним плодолистиком, раскрывается двумя створками.");
        fruitDescription.put("Стручок", "двугнездный плод, образован двумя плодолистиками, раскрывается двумя створками, между которыми имеется перегородка, к которой прикрепляются семена.");
        fruitDescription.put("Коробочка", "многосемянной плод, образованный несколькими плодолистиками, раскрывается разнообразными способами: створками, дырочками, крышечкой и т.д.");
        fruitDescription.put("Орех", "околоплодник деревянистый или плотно кожистый, не срастается с семенем. Пестик образован несколькими плодолистиками.");
        fruitDescription.put("Семянка", "имеет кожистый околоплодник, не срастающийся с семенем.");
        fruitDescription.put("Зерновка", "имеет плёнчатый околоплодник, срастающийся с семенем. Характерна для злаков.");
        fruitDescription.put("Жёлудь", "имеет плотно-кожистый околоплодник; при плодах есть плюска, образованная срастанием деревянистых прицветных чешуй.");
        fruitDescription.put("Костянка", "односемянной плод с чётко различимыми слоями околоплодника: наружный слой плёнчатый; срединный — сочный, мясистый; внутренний деревянистый, образующий косточку (слива, вишня, черешня). Если в цветке несколько пестиков, развивается многокостянка.");
        fruitDescription.put("Ягода", "плод многосемянный, с плёнчатым или плёнчато-кожистым наружным слоем околоплодника, сочным срединным и плёнчатым внутренним слоем. Образуется в цветках с верхней (виноград, ландыш) и нижней (черника, смородина) завязью. Пестик состоит из нескольких плодолистиков.");
        fruitDescription.put("Яблоко", "многосемянный, многогнёздный плод с кожистым наружным слоем околоплодника, сочным и мясистым срединным и хрящеватым внутренним слоем. Образуется из цветков с нижней завязью (рябина, айва, яблоня).");
        fruitDescription.put("Тыквина", "многосемянный плод с твёрдым, иногда деревянистым наружным слоем околоплодника и сочными, мясистыми срединным и внутренним слоями. Образуется тыквина в цветках с нижней завязью из пестиков, состоящих из нескольких плодолистиков.");
        fruitDescription.put("Померанец", "многосемянный, многогнёздный плод, образуется в цветках с верхней завязью из пестика, который состоит из нескольких плодолистиков. Наружный слой околоплодника кожистый, с эфиро­масличными желёзками, срединный — губчатый, белый; внутренний — мясистый, сочный.");
        fruitExample = new HashMap<>();
        fruitExample.put("Живокость", "Листовка");
        fruitExample.put("Фасоль", "Боб");
        fruitExample.put("Горчица", "Стручок");
        fruitExample.put("Мак", "Коробочка");
        fruitExample.put("Лещина", "Орех");
        fruitExample.put("Одуванчик", "Семянка");
        fruitExample.put("Пшеница", "Зерновка");
        fruitExample.put("Каштан", "Жёлудь");
        fruitExample.put("Слива", "Костянка");
        fruitExample.put("Виноград", "Ягода");
        fruitExample.put("Рябина", "Яблоко");
        fruitExample.put("Арбуз", "Тыквина");
        fruitExample.put("Апельсин", "Померанец");
    }

    private void printAllFruits() {
        for (Map.Entry<String, String> item : fruitDescription.entrySet()) {
            String example = "неизвестен";
            for (Map.Entry<String, String> item2 : fruitExample.entrySet()) {
                if (item2.getValue().equals(item.getKey())) example = item2.getKey();
            }
            System.out.println("Тип плода: " + item.getKey() + " – " + item.getValue() + "\nПример: " + example);
        }
    }

    private void getFruitType() {
        Scanner scanner2 = new Scanner(System.in);
        String plant = scanner2.nextLine();
        System.out.println("У растения " + plant + " тип плода - " + fruitExample.getOrDefault(plant, "неизвестен, выберите другое растение."));
        choice();
    }

    private void printOnlyExamples() {
        System.out.println("Примеры (растение/тип плода): ");
        for (Map.Entry<String, String> item : fruitExample.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }
    }

    private void greeting() {
        System.out.println("Добрый день! Перед Вами программа \"Юный ботаник\"");
    }

    private void choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВыберите, что Вы хотите сделать:" +
                "\n1 - Вывести весь список типов плодов у растений с описанием и примерами." +
                "\n2 - Вывести только примеры растений с типом плода." +
                "\n3 - Ввести своё растение и узнать его тип плода (ограниченно имеющимся в программе списком)" +
                "\n4 - Выйти из программы");
        if (scanner.hasNextInt()) {
            switch (scanner.nextInt()) {
                case 1:
                    printAllFruits();
                    choice();
                    break;
                case 2:
                    printOnlyExamples();
                    choice();
                    break;
                case 3:
                    System.out.println("Введите своё растение.");
                    getFruitType();
                    break;
                case 4:
                    System.out.println("Мы надеемся, что программа Вам понравилась.");
                    break;
                default:
                    System.out.println("Вы ввели неправильное значение. Выберите одну из опций (1-4).");
                    choice();
                    break;
            }
        } else {
            System.out.println("Вы ввели неправильное значение. Выберите одну из опций (1-4).");
            choice();
        }
    }

    public void start() {
        greeting();
        choice();
    }
}
