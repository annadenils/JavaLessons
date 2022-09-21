package ThirdLesson;

public abstract class Vender {
    public String name;

    abstract void getName();

    public Vender (String name){
        this.name = name;
    }
}
