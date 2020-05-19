package hw6.task2;

import java.util.*;

public class MyShop {
    private Queue<Person> shopQueue;
    private Map<String, Double> products;
    private Double money;
    private Scanner scanner;
    private ArrayList<String> productList;

    {
        scanner = new Scanner(System.in);
        shopQueue = new PriorityQueue<>();
        products = new HashMap<>();
        products.put("1. Роял Чизбургер", 4.9);
        products.put("2. Куриные крылышки", 6.2);
        products.put("3. Картофель фри", 2.8);
        products.put("4. Кока-Кола", 2.2);
        products.put("5. МакФлурри", 4.3);
        productList = new ArrayList<>();
        productList.add("1. Роял Чизбургер");
        productList.add("2. Куриные крылышки");
        productList.add("3. Картофель фри");
        productList.add("4. Кока-Кола");
        productList.add("5. МакФлурри");
        money = 0.0;
    }

    public void printProducts() {
        System.out.println("Меню:");
        for (String str:productList) {
            System.out.println(str + " - " + products.get(str));
        }
    }

    public void addPersonInQueue() {
        Person person = new Person(chooseProducts());
        shopQueue.add(person);
    }

    public Map<String, Integer> chooseProducts() {
        Map<String, Integer> selectedProducts = new HashMap<>();
        printProducts();
        while (true) {
            int menuItem = getMenuItem();
            if (menuItem <= 0) {
                break;
            }
            int menuItemQuantity = getMenuItemQuantity();
            if (menuItemQuantity <=0) {
                break;
            }
            selectedProducts.put(productList.get(menuItem-1), menuItemQuantity);
        }
        if (selectedProducts.size()==0){
            System.out.println("товары не выбраны");
            choice();
        }
        return selectedProducts;
    }

    private int getMenuItem() {
        System.out.println("Выберите номер товара в меню. Для выхода из меню введите любую букву");
        int menuItem = 0;
        if (scanner.hasNextInt()) {
            menuItem = scanner.nextInt();
            if (menuItem > 0 && menuItem < products.size() + 1) {
                return menuItem;
            } else {
                System.out.println("Вы ввели неправильное число " + menuItem + ".");
                return getMenuItem();
            }
        } else {
            System.out.println("Вы закончили выбор товара (введено значение " + scanner.next() + ").");
            return menuItem;
        }
    }

    private int getMenuItemQuantity() {
        System.out.println("Введите количество выбранного товара. Максимальное количество - 50 шт.");
        int itemQuantity = 0;
        if (scanner.hasNextInt()) {
            itemQuantity = scanner.nextInt();
            if (itemQuantity > 0 && itemQuantity <= 50) {
                return itemQuantity;
            } else {
                System.out.println("Вы ввели неправильное значение " + itemQuantity + ".");
                return getMenuItemQuantity();
            }
        } else {
            System.out.println("Вы ввели неправильное значение " + scanner.next() + ".");
            return getMenuItemQuantity();
        }
    }

    public void countMoney(Person person) {
        for (Map.Entry<String, Integer> item : person.getMyProducts().entrySet()) {
            double price = products.get(item.getKey()) * item.getValue();
            money += price;
        }
    }

    private void servePersonInQueue() {
        if(!shopQueue.isEmpty()){
            Person person = shopQueue.poll();
            countMoney(person);
            System.out.println("Покупатель купил:");
            for (Map.Entry<String, Integer> item:person.getMyProducts().entrySet()) {
                System.out.println(item.getKey() + " - " + item.getValue() + "шт.");
            }
        } else {
            System.out.println("Очередь пуста.");
        }
    }


    public void choice() {
        System.out.println("\nВыберите, что Вы хотите сделать: (количество человек в очереди - " + shopQueue.size() + ", выручка - " + money + ")" +
                "\n1 - Добавить покупателя в очередь" +
                "\n2 - Обслужить покупателя в очереди" +
                "\n3 - Выйти из программы");
        if (scanner.hasNextInt()) {
            switch (scanner.nextInt()) {
                case 1:
                    addPersonInQueue();
                    choice();
                    break;
                case 2:
                    if (shopQueue.size()>0) {
                        servePersonInQueue();
                    } else {
                        System.out.println("Очередь пуста.");
                    }
                    choice();
                    break;
                case 3:
                    System.out.println("Мы надеемся, что программа Вам понравилась. Выручка магазина - " + money);
                    break;
                default:
                    System.out.println("Вы ввели неправильное значение" + scanner.next() + ". Выберите одну из опций (1-3).");
                    choice();
                    break;
            }
        } else {
            System.out.println("Вы ввели неправильное значение" + scanner.next() + ". Выберите одну из опций (1-3).");
            choice();
        }
    }
}