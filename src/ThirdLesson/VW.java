package ThirdLesson;

public class VW extends Auto {

    VW(int power, String bodyType, String color){
        super(power, bodyType, color);
    }

    public static void ModelVw (String model){
        if (model.equals("Tiguan")){
            System.out.println("Volkswagen compact crossover - " + model);
        }
        else if (model.equals("Touareg")){
            System.out.println("Volkswagen mid-size crossover - " + model);
        }
        else if (model.equals("Golf")){
            System.out.println("Volkswagen compact car - " + model);
        }
        else {
            System.out.println("Other interesting car model");
        }

    }

}
