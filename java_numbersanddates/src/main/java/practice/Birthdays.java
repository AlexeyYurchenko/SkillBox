package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Birthdays {

    public static void main(String[] args) {

        int day = 20;
        int month = 02;
        int year = 1987;


        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);
        int num = 0;
        String text = "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - EE").localizedBy(new Locale("us"));
        while (true) {
            if (birthday.isAfter(today)) {
                break;
            }
            text += num++ + " - " + formatter.format(birthday) + System.lineSeparator();
            birthday = birthday.plusYears(1);
        }

        return text;
    }
}