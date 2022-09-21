package ThirdLesson;

public class Information{
    protected int available = 4;
    private int sales= 8;

    public static void main(String[] args) {
        Information sales = new Information();
        System.out.println("In this month we sales " + sales.sales + " cars.");

    }
    public static void Dtp (int dtp){
        if (dtp>0){
            System.out.println("Auto has " + dtp + " car accident");
        }
        else {
            System.out.println("No car accident");
        }
    }

    static final void TurboType (){
        if (false){
            System.out.println("Car has ordinary engine");
        }
        else {
            System.out.println("Car has turbo engine");
        }
    }
}

