package hw6.task3;

import java.util.*;

public class MyMap {
    private Map<String, String> myMap;
    private Set<String> mapKeys;
    private Collection<String> mapValues;

    {
        myMap = new HashMap<>();
        mapKeys = new HashSet<>();
        mapValues = new ArrayList<>();
    }

    public void start() {
        System.out.println("Введите несколько строчек с парами \"ключ значение\" (через пробел), а потом введите stop");
        createMap();
        if (!myMap.isEmpty()) {
            printMap();
            printKeys();
            printValues();
        } else {
            System.out.println("Коллекция не создана.");
        }
    }

    private void createMap() {
        Scanner scanner = new Scanner(System.in);
        String separator = " ";
        while (true) {
            String str = scanner.nextLine();
            String[] arr = str.split(separator);
            if (arr.length == 2) {
                myMap.put(arr[0], arr[1]);
            } else {
                if (str.contains("stop")) break;
                System.out.println("Введены неверные значения");
                break;
            }
        }
    }

    public void printMap() {
        if (!myMap.isEmpty()) {
            System.out.println("Созданная коллекция:");
            for (Map.Entry<String, String> item : myMap.entrySet()) {
                System.out.println(item.getKey() + " " + item.getValue());
            }
        } else {
            System.out.println("Сначала создайте коллекцию!");
        }
    }

    public void printKeys() {
        if (!myMap.isEmpty()) {
            mapKeys = myMap.keySet();
            System.out.println("\nВсе ключи:");
            for (String str : mapKeys) {
                System.out.println(str);
            }
        } else {
            System.out.println("Сначала создайте коллекцию!");
        }
    }

    public void printValues() {
        if (!myMap.isEmpty()) {
            mapValues = myMap.values();
            System.out.println("\nВсе значения:");
            for (String str : mapValues) {
                System.out.println(str);
            }
        } else {
            System.out.println("Сначала создайте коллекцию!");
        }
    }
}
