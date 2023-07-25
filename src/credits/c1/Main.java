package credits.c1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Имеется прямоугольное отверстие размером a на b.
        // Определить можно ли полностью закрыть отверстие круглой картонкой радиусом r.



        System.out.println("введите длину");
        Scanner lenght = new Scanner(System.in);
        int a = lenght.nextInt();
        System.out.println("введите ширину");
        Scanner widht = new Scanner(System.in);
        int b = widht.nextInt();
        System.out.println("введите padiyc");
        Scanner radius = new Scanner(System.in);
        int r = radius.nextInt();
        if (r * r >= (a * a + b * b) / 4)
            System.out.println("закрывает");
        else
            System.out.println("Не закрывает");
    }
}
