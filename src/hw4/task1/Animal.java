package hw4.task1;

public abstract class Animal implements iAction {
    protected String name; // кличка
    protected int age; // возраст
    protected Feeding feeding; // тип питания (плотоядный, травоядный, всеядный)
    protected Family family; // семейство

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getAnimalFeeding() {
        System.out.println(this.getClass().getSimpleName() + " is " + this.feeding + ".");
    }

    public void getAnimalFamily() {
        System.out.println(this.getClass().getSimpleName() + " is from " + this.family + " family.");
    }
}
