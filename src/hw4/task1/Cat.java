package hw4.task1;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
        super.feeding = Feeding.CARNIVOROUS;
        super.family = Family.FELIDAE;
    }

    @Override
    public void sound() {
        System.out.println("Cat says: \"Myau-myau-myau\"");
    }

    @Override
    public void move() {
        System.out.println(this.name + " moves like cat.");
    }

    @Override
    public void eatSomeone(Animal animal) {
        switch (animal.getClass().getSimpleName()) {
            case "Mouse":
                System.out.println(this.name + " (cat) ate " + animal.name + " (mouse).");
                break;
            case "Cat":
                System.out.println("Cat cannot eat other cat.");
                break;
            case "Dog":
                System.out.println("Cat cannot eat a dog.");
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
                System.out.println("Cat cannot be eaten by a mouse.");
                break;
            case "Cat":
                System.out.println("Cat cannot be eaten by other cat.");
                break;
            case "Dog":
                System.out.println(this.name + " (cat) is eaten by " + animal.name + " (dog).");
                break;
            default:
                System.out.println("Unknown animal.");
                break;
        }
    }
}
