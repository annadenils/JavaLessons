package SecondLesson;

public class SLTask3 {

    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        String Word = words[words.length - 1];
        if (Word.length() == 0) {
            System.out.println("nothing");
            return 0;
        } else {
            System.out.println("here" + Word);
            return Word.length();
        }
    }
}

