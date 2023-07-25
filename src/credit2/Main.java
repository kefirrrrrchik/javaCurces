package credit2;

import java.util.Scanner;

public class Main {
    //Напишите программу расчета даты следующего дня введя 3 числа - день, месяц и год.

    public static void main(String[] args) {
        System.out.println("vvedi den");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        System.out.println("vvedi mes");
        int month = scanner.nextInt();
        System.out.println("vvedi god");
        int year = scanner.nextInt();

        if (!isDateCorrect(day,month,year))
        {
            System.out.println("date invalid");
            return;
        }
        System.out.println("ok");

       // System.out.println(isDayLast(day,month,year));
    if(isLastDayInYear(day,month)){
            year++;
            day = 1;
            month = 1;
            printDate(day,month,year);
            return;
        }

    if (isDayLast(day,month,year)){
        day = 1;
        month++;
        printDate(day,month,year);
        return;
    }
    day++;
    printDate(day,month,year);
    }
   public static boolean isDateCorrect(int day, int month, int year) {
       if (day < 1 || day > 31) return false;
       if (month < 1 || month > 12) return false;
       if (year < 1) return false;
       boolean isMonth30 = month == 4 || month == 6 || month == 9 || month == 11;
       if (isMonth30 && day > 30) return  false;
//Год, номер которого крaтен 400, — високосный;
// остaльные годы, номер которых крaтен
// 100, — невисокосные (нaпример, годы 1700, 1800, 1900, 2100, 2200, 2300)
// остaльные годы, номер которых крaтен 4, — високосные;
//все остaльные годы — невисокосные.
//is dificult

       if (month==2 && year%4 == 0 && day>29) return false;
       if(month==2 && year%4!=4 && day>28) return false;
       return true;
   }


   public static boolean isDayLast(int day, int month, int year){
        if (day==31) return true;
       boolean isMonth30 = month == 4 || month == 6 || month == 9 || month == 11;
       if (isMonth30&&day==30) return true;
       boolean isYearV = year%4==0;
       if (month==2 && isYearV && day==29) return true;
       if (month==2 && !isYearV && day==28) return true;
        return false;

   }
   public static boolean isLastDayInYear(int day, int month){
        if (day==31 && month ==12) return true;
        return false;
   }
   public static boolean isDecember(int month){
        if (month==12) return true;
        return false;
   }
public static void printDate(int day, int month, int year)
{
    System.out.println("дата: " + day + "." + month + "." + year);
}
}
