package exam.e1;
//Напишите программу, которая будет переводить секунды в отформатированный вид - часы, минуты, секунды.
// Слова должны иметь правильное окончание.
//Для более высокого балла добавьте недели и сутки.
//Постарайтесь не выводить данные, значение которых равно 0

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(701%10);

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
        if (weeks > 0 && weeks >= 5) {
            result.append(weeks).append(" недель, ");
        }
        if (weeks > 0 && weeks >= 20 && weeks%10 == 1) {
            result.append(weeks).append(" неделя, ");
        }
        if (weeks > 0 && weeks == 1){
            result.append(weeks).append(" неделя, ");
        }
        if (weeks > 0 && weeks > 1 && weeks < 5){
            result.append(weeks).append(" недели, ");
        }
        if (days > 0 && days > 5) {
            result.append(days).append(" дней, ");
        }
        if (days > 0 && days == 1) {
            result.append(days).append(" день, ");
        }
        if (days > 0 && days > 1 && days < 5) {
            result.append(days).append(" дня, ");
        }
        if (hours > 0) {
            result.append(hours).append(" часов, ");
        }
        if (minutes > 0) {
            result.append(minutes).append(" минут, ");
        }
        if (seconds > 0) {
            result.append(seconds).append(" секунд.");
        }

        return result.toString().trim();
    }

}