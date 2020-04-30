package hw4.task1;

public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 5);
        Cat cat2 = new Cat("Alisa", 3);
        Mouse mouse1 = new Mouse("Miki", 2);
        Mouse mouse2 = new Mouse("Mini", 1);
        Dog dog1 = new Dog("Fluffy", 4);
        Dog dog2 = new Dog("Buddy", 4);

        // Протестируем класс Кот
        System.out.println("Cats:");
        cat1.getAnimalFamily();
        cat1.getAnimalFeeding();
        cat1.sound();
        cat1.move();
        cat1.eatSomeone(cat2);
        cat1.eatSomeone(mouse1);
        cat1.eatSomeone(dog1);
        cat1.eatenBySomeone(cat2);
        cat1.eatenBySomeone(mouse1);
        cat1.eatenBySomeone(dog1);

        // Протестируем класс Мышь
        System.out.println("\nMice:");
        mouse1.getAnimalFamily();
        mouse1.getAnimalFeeding();
        mouse1.sound();
        mouse1.move();
        mouse1.eatSomeone(cat1);
        mouse1.eatSomeone(mouse2);
        mouse1.eatSomeone(dog1);
        mouse1.eatenBySomeone(cat1);
        mouse1.eatenBySomeone(mouse2);
        mouse1.eatenBySomeone(dog1);

        // Протестируем класс Собака
        System.out.println("\nDogs:");
        dog1.getAnimalFamily();
        dog1.getAnimalFeeding();
        dog1.sound();
        dog1.move();
        dog1.eatSomeone(cat1);
        dog1.eatSomeone(mouse1);
        dog1.eatSomeone(dog2);
        dog1.eatenBySomeone(cat1);
        dog1.eatenBySomeone(mouse1);
        dog1.eatenBySomeone(dog2);
    }
}
