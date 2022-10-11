package ThirdLesson;

public class Main {

    public static void main(String[] args) {
        Vender Dealer = new Dealer("PulkovoAvto");
        Dealer.getName();
        Information available = new Information();
        System.out.println(available.available + " cars");
        Auto VW = new VW(181, "disel", "Grey");
        ThirdLesson.VW.ModelVw("Tiguan");
        System.out.printf("%s color with %s engine type and power in %s horsepower%n",
                VW.color, VW.engineType, VW.power);
        Information.Dtp(9);
        Auto.WinterPackage winterPackage = new Auto.WinterPackage();
        winterPackage.W(true);
        Auto Skoda = new Skoda(99, "petrol", "Red");
        ThirdLesson.Skoda.ModelSkoda("Karoq");
        System.out.printf("%s color with %s engine type and power in %s horsepower%n",
                Skoda.color, Skoda.engineType, Skoda.power);
        Information.TurboType();
        Information.Dtp(0);
        Washing washing = new Washing(){
            @Override
            public void washing() {
                System.out.println("Cars wash with shampoo");
            }
        };
        washing.washing();
        Wheels wheels = new Wheels(18,65);


    }
}
