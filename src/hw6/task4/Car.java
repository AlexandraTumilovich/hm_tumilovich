package hw6.task4;

public class Car {
    private String model;
    private String producer;
    private String color;
    private int year;
    private int price;
    private int id;
    private static int counter;

    public Car() {
        counter++;
        id = counter;
    }

    public Car(String producer, String model, String color, int year, int price) {
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.year = year;
        this.price = price;
        counter++;
        id = counter;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void getInfo() {
        System.out.println("id: " + getId() + ", Производитель: " + getProducer() + ", Модель: " + getModel() + ", Цвет: " + getColor() + ", Год: " + getYear() + ", Цена -  "
                + getPrice() + " Евро");
    }
}
