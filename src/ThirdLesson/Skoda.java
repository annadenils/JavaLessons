package ThirdLesson;

public class Skoda extends Auto{
    Skoda(int power, String bodyType, String color){
        super(power, bodyType, color);
    }
    public static void ModelSkoda (String model){
        if (model.equals("Fabia")){
            System.out.println("Small class car - " + model);
        }
        else if (model.equals("Kodiaq")){
            System.out.println("Mid-size crossover - " + model);
        }
        else if (model.equals("Karoq")){
            System.out.println("Compact crossover - " + model);
        }
        else {
            System.out.println("Other interesting car model");
        }

    }
}
