package hw4.task1;

public class Mouse extends Animal {
    public Mouse(String name, int age) {
        super(name, age);
        this.feeding = Feeding.HERBIVOROUS;
        this.family = Family.MURIDAE;
    }

    @Override
    public void sound() {
        System.out.println("Mouse says: \"Pi-pi-pi\"");
    }

    @Override
    public void move() {
        System.out.println(this.name + " moves like mouse.");
    }

    @Override
    public void eatSomeone(Animal animal) {
        System.out.println("Mouse cannot eat anyone!");
    }

    @Override
    public void eatenBySomeone(Animal animal) {
        switch (animal.getClass().getSimpleName()) {
            case "Mouse":
                System.out.println("Mouse cannot be eaten by other mouse.");
                break;
            case "Cat":
                System.out.println(this.name + " (mouse) is eaten by " + animal.name + " (cat).");
                break;
            case "Dog":
                System.out.println(this.name + " (mouse) is eaten by " + animal.name + " (dog).");
                break;
            default:
                System.out.println("Unknown animal.");
                break;
        }
    }
}
