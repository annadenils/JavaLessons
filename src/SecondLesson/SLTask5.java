package SecondLesson;

public class SLTask5 {
    public static void main(String[] args) {
        BFuzz(19);
        }

    public static void BFuzz(int x){
        if (x%3 == 0){
            if (x%5 == 0){
                System.out.println("Fizz-buzz");}
                else System.out.println("Fizz");
        }
            else if (x%5 == 0){
                System.out.println("Buzz");
        }
            else{
                System.out.println("Number is not for 3 and 5");
            }}


    }
