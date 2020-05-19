package hw6.task4;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

//Программа должна содержать пользовательское меню с пунктами «добавить машину», «получить информацию по машине», «купить», «получить весь список машин».
public class CarShop {
    private ArrayList<Car> allCars;
    private Scanner scanner;

    {
        allCars = new ArrayList<>();
        scanner = new Scanner(System.in);
        allCars.add(new Car ("Toyota", "q1", "Белый", 2019, 10000));
        allCars.add(new Car ("Kia", "w2", "Черный", 2018, 13000));
        allCars.add(new Car ("Volksvagen", "w2", "Черный", 2018, 13000));
    }

    private void printCars(){
        if (allCars.size()!=0){
            for (Car car:allCars) {
                car.getInfo();
            }
        } else {
            System.out.println("Автомобилей в салоне нет.");
        }
    }

    private void addCar(){
        System.out.println("Добавление новой машины.");
        Car car = new Car();
        System.out.println("Введите производителя: ");
        String carProducer = scanner.next();
        car.setProducer(carProducer);
        System.out.println("Введите модель машины.");
        String carModel = scanner.next();
        car.setModel(carModel);
        System.out.println("Введите цвет машины.");
        String carColor = scanner.next();
        car.setColor(carColor);
        car.setYear(getCarYear());
        car.setPrice(getCarPrice());
        allCars.add(car);
    }

    private int getCarYear(){
        System.out.println("Введите год машины.");
        if(scanner.hasNextInt()){
            return scanner.nextInt();
        } else {
            System.out.println("Значение \"" + scanner.next() + "\" - неверное. Вы не ввели год. Начните заново.");
            return getCarYear();
        }
    }

    private int getCarPrice(){
        System.out.println("Введите стоимость.");
        if(scanner.hasNextInt()){
            return scanner.nextInt();
        } else {
            System.out.println("Значение \"" + scanner.next() + "\" - неверное. Вы не ввели стоимость. Начните заново.");
            return getCarPrice();
        }
    }

    private void getInfo(){
        boolean exist = false;
        System.out.println("Введите id автомобиля, о котором вы хотите узнать.");
        if(scanner.hasNextInt()){
            int carId = scanner.nextInt();
            for (Car car:allCars) {
                if(carId==car.getId()){
                    car.getInfo();
                    exist = true;
                }
            }
            if(!exist){
                System.out.println("Такого автомобиля нет.");
            }
        } else {
            System.out.println("Введено неверное значение " + scanner.next());
        }
    }

    private void buyCar(){
        boolean exist = false;
        System.out.println("Введите id автомобиля, который вы хотите купить.");
        if(scanner.hasNextInt()){
            int carId = scanner.nextInt();
            for (int i = 0; i < allCars.size(); i++) {
                if(carId==allCars.get(i).getId()){
                    allCars.remove(i);
                    exist = true;
                    System.out.println("Автомобиль продан.");
                }
            }
            if(!exist){
                System.out.println("Такого автомобиля нет.");
            }
        } else {
            System.out.println("Введено неверное значение" + scanner.next());
        }
    }

    public void choice(){
        System.out.println("\nВыберите, что Вы хотите сделать: " +
                "\n1 - добавить автомобиль" +
                "\n2 - получить информацию по автомобилю" +
                "\n3 - купить автомобиль" +
                "\n4 - получить весь список автомобилей" +
                "\n5 - выйти из программы"
        );
        if (scanner.hasNextInt()) {
            switch (scanner.nextInt()) {
                case 1:
                    addCar();
                    choice();
                    break;
                case 2:
                    getInfo();
                    choice();
                    break;
                case 3:
                    buyCar();
                    choice();
                    break;
                case 4:
                    printCars();
                    choice();
                    break;
                case 5:
                    System.out.println("Мы надеемся, что программа Вам понравилась.");
                    break;
                default:
                    System.out.println("Вы ввели неправильное значение" + scanner.next() + ". Выберите одну из опций (1-5).");
                    choice();
                    break;
            }
        } else {
            System.out.println("Вы ввели неправильное значение" + scanner.next() + ". Выберите одну из опций (1-5).");
            choice();
        }
    }
}
