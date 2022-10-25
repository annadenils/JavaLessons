package TenLesson;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    static String email = "dfjhsk@d98.r5u";
    static String phone = "+7 (992) 483-48 48";
    static String book = "978-28-266-1156-9";
    static String date = "2025-Oct-17";

    public static void main(String[] args) {
        email();
        phone();
        bookISBN13();
        date();
    }

    public static void email(){
        Pattern pattern = Pattern.compile("\\w+@[a-z0-9]+\\.[a-z]{2}", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()){
            System.out.println("E-mail is correct");
        }
        else {
            System.out.println("E-mail is not correct");
        }
    }

    public static void phone(){
        Pattern pattern1 = Pattern.compile("^(\\+\\d\\s)?\\(?\\d{3}\\)?\\s?-?\\d{3}\\s?-?\\d{2}\\s?-?\\d{2}$");
        Matcher matcher1 = pattern1.matcher(phone);
        if (matcher1.find()){
            System.out.println("Phone is correct");
        }
        else {
            System.out.println("Phone is not correct");
        }
    }

    public static void bookISBN13(){
        Pattern pattern2 = Pattern.compile("^97[89][- ]?[0-9]{1,5}[- ]?[0-9]{1,7}+[- ]?[0-9]{1,6}+[- ]?[0-9]?$");
        Matcher matcher2 = pattern2.matcher(book);
        if (matcher2.find()) {
            System.out.println("IBAN is correct");
        }
        else {
            System.out.println("IBAN is not correct");
        }
    }

    public static void date(){
        Pattern pattern3 = Pattern.compile("^[0-9]{4}-?(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Non|Dec)-?[0-9]{1,2}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher3 = pattern3.matcher(date);
        if(matcher3.find()){
            System.out.println("Date is correct");
        }
        else {
            System.out.println("Date is not correct");
        }
    }
}
