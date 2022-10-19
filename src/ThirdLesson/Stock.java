package ThirdLesson;

import java.io.Serializable;

public class Stock implements Serializable {

    public int amount;
    public String name;
    public String color;

    public Stock (int amount, String name, String color){
        this.amount = amount;
        this.name = name;
        this.color = color;

    }

    @Override
    public String toString() {
        return "Stock{" +
                "amount=" + amount +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
