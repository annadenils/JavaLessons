package SecondLesson;

public class SLTask4 {

    public int mySqrt(int x){
        x = 9;
        long y = x;
        while (y*y > x)
            y = (y + x/y) / 2;
        return (int) y;
    }
}
