package ThirdLesson;

public class Dealer extends Vender{


    public Dealer(String name) {
        super(name);
    }

    @Override
    void getName() {
        System.out.println("Dealer " + name + " offers");
    }

    @Override
    public String toString() {
        return String.format("Dealer " + name + " offers");
    }
}
