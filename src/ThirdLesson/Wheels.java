package ThirdLesson;

public class Wheels extends Auto.Wheels {
    public Wheels(int diameter, int width) {
        new Auto().super();
        System.out.println("Wheels are diametr " + diameter + " and width " + width);
    }

}
