package ThirdLesson;

public class Main {

    public static void main(String[] args) {
        Information available = new Information();
        System.out.println(String.format("We have " + available.available + " cars"));
        Auto VW = new VW(181, "Tiguan", "Grey");
        System.out.println(String.format("%s VW %s with power %s", VW.color, VW.model, VW.power));
        Auto Skoda = new Skoda(99, "Fabia", "Red");
        System.out.println(String.format("%s Skoda %s with power %s", Skoda.color, Skoda.model, Skoda.power));

    }
}
