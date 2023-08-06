package exam.e1;
//Напишите программу, которая будет переводить секунды в отформатированный вид - часы, минуты, секунды.
// Слова должны иметь правильное окончание.
//Для более высокого балла добавьте недели и сутки.
//Постарайтесь не выводить данные, значение которых равно 0

import java.util.Scanner;

public class Main {
    static String[] secondsArr = {"секунда", "секунды", "секунд"};
    static String[] minutsArr = {"минута", "минуты", "минут"};
    static String[] hoursArr = {"час", "часа", "часов"};
    static String[] daysArr = {"день", "дня", "дней"};
    static String[] weeksArr = {"неделя", "недели", "недель"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println(701%10);


        try {
            System.out.print("Введите количество секунд: ");
            int sec = Integer.parseInt(scanner.nextLine());

            if (sec < 0) {
                System.out.println("Количество не может быть отрицательнным.");
            } else {
                String formattedTime = formatSeconds(sec);
                System.out.println("Отформатированное время: " + formattedTime);
            }
        } catch (NumberFormatException e) {
            System.out.println("Не корректное число секунд.");
        }




    }


    public static String formatSeconds(int seconds) {
        int weeks = seconds / (7 * 24 * 60 * 60);
        seconds %= (7 * 24 * 60 * 60);
        int days = seconds / (24 * 60 * 60);
        seconds %= (24 * 60 * 60);
        int hours = seconds / (60 * 60);
        seconds %= (60 * 60);
        int minutes = seconds / 60;
        seconds %= 60;

        StringBuilder result = new StringBuilder();

        if (weeks > 0) {
            String text = getText(weeks, weeksArr);
            result.append(weeks).append(" " + text + " ");
        }
        if (days > 0) {
            String text = getText(days, daysArr);
            result.append(days).append(" " + text + " ");
        }
        if (hours > 0) {
            String text = getText(hours, hoursArr);
            result.append(hours).append(" " + text + " ");
        }
        if (minutes > 0) {
            String text = getText(minutes, minutsArr);
            result.append(minutes).append(" " + text + " ");
        }

        if (seconds > 0) {
            String text = getText(seconds, secondsArr);
            result.append(seconds).append(" " + text + ".");
        }
        return result.toString().trim();
    }

    public static String getText ( int number, String[] text)
    {
        if (number >= 5 && number <= 20)
            return text[2];
        int lastDigit = number % 10;
        if (lastDigit == 1)
            return text[0];
        if (lastDigit == 2 || lastDigit == 3 || lastDigit == 4)
        return text[1];
        return text[2];
    }
}