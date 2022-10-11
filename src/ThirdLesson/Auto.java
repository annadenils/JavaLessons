package ThirdLesson;

public class Auto {
    int power;
    String engineType;
    String color;

    Auto (int power, String engineType, String color){
        System.out.println("Your auto can be:");
        this.power = power;
        this.engineType = engineType;
        this.color = color;
    }

    public Auto() {

    }

    public static class WinterPackage {
        public void W (boolean W){
            if (W){
                System.out.println("Cars is with winter package");
            }
            else {
                System.out.println("Cars is without winter package");
            }
        }
    }

    public class Wheels{

        public Wheels () {
            System.out.println("All cars are with wheels");
        }
    }

}
