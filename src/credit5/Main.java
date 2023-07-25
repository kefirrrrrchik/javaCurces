package credit5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //5.Введите число с клавиатуры.
        // Определите, является ли это число простым
        System.out.println("введите число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(isSimple(number))
            System.out.println("Simple");
        else System.out.println("not simple");

    }
    public static boolean isSimple(int number){
        for (int x=2; x<=number/2; x++)
            if (number%x==0) return false;
        return true;
    }
}
