package ThirdLesson;

import java.io.*;

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
        try (ObjectOutputStream from = new ObjectOutputStream(new FileOutputStream("src/file/Stock.txt")))
        {
            Stock MotorOil = new Stock(240, "MotorOil for VW", "-");
            from.writeObject(MotorOil);
            } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (ObjectInputStream to = new ObjectInputStream(new FileInputStream("src/file/Stock.txt")))
        {
            Stock MotorOil = (Stock) to.readObject();
            System.out.println(MotorOil);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        GetReady getReady = new GetReady();
        getReady.Money();
        getReady.Contract();
        try {
            getReady.getready();
        } catch (ReadyException e) {
            System.out.println(e.getMessage());
        }


    }
}
