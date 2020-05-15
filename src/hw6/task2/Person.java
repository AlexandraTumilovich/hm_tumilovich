package hw6.task2;

import java.util.HashMap;
import java.util.Map;

public class Person implements Comparable{
    private Map<String,Integer> myProducts;
    private static int queueNumber;
    private int myQueueNumber;

    public Person(Map<String, Integer> myProducts) {
        this.myProducts = myProducts;
        myQueueNumber=queueNumber+1;
    }

    public Map<String, Integer> getMyProducts() {
        return myProducts;
    }

    public void addProduct(String product, Integer quantity){
        myProducts.put(product, quantity);
    }

    public int compareTo(Person other) {
        return Integer.compare(this.myQueueNumber, other.myQueueNumber);
    }

    @Override
    public int compareTo(Object o) {
        Person other = (Person) o;
        return Integer.compare(this.myQueueNumber, other.myQueueNumber);
    }
}
