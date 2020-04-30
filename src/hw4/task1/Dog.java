package hw4.task1;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
        this.feeding = Feeding.OMNIVOROUS;
        this.family = Family.CANIDAE;
    }

    @Override
    public void sound() {
        System.out.println("Dog says: \"Gau-gau-gau\"");
    }

    @Override
    public void move() {
        System.out.println(this.name + " moves like dog.");
    }

    @Override
    public void eatSomeone(Animal animal) {
        switch (animal.getClass().getSimpleName()) {
            case "Mouse":
                System.out.println(this.name + " (dog) ate " + animal.name + " (mouse).");
                break;
            case "Cat":
                System.out.println(this.name + " (dog) ate " + animal.name + " (cat).");
                break;
            case "Dog":
                System.out.println("Dog cannot eat other dog.");
                break;
            default:
                System.out.println("Unknown animal to eat.");
                break;
        }
    }

    @Override
    public void eatenBySomeone(Animal animal) {
        switch (animal.getClass().getSimpleName()) {
            case "Mouse":
                System.out.println("Dog cannot be eaten by mouse.");
                break;
            case "Cat":
                System.out.println("Dog cannot be eaten by cat.");
                break;
            case "Dog":
                System.out.println("Dog cannot be eaten by other dog.");
                break;
            default:
                System.out.println("Unknown animal.");
                break;
        }
    }
}
