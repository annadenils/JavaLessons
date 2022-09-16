package ThirdLesson;

public class Information{
    protected int available = 4;
    private int sales= 8;

    public static void main(String[] args) {
        Information sales = new Information();
        System.out.println(String.format("In this month we sales " + sales.sales + " cars."));

    }


}

