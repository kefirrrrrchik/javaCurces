package exam.e3;
//Создать двумерный квадратный массив размера n. Заполнить его случайными числами таким образом:
//
//числа по диагонали равны 0;
//вверху и снизу от пересечения диагоналей находятся только положительные числа (> 0);
//слева и справа от пересечения диагоналей находятся только отрицательные числа (< 0);
//Вывести массив на экран.
//
//Найти сумму всех элементов;
//Найти среднее арифметическое всех элементов, которые больше суммы всех элементов;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite razmernost massiva");

        int n = scanner.nextInt();

        int[][] array = new int[n][n];

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i == n - j - 1) {
                    array[i][j] = 0;
                } else if (i < j && i + j < n - 1 || i > j && i + j > n - 1) {
                    while (array[i][j] <= 0) {
                        array[i][j] = random.nextInt(10);
                    }
                } else

                    {
                    while (array[i][j] >= 0) {
                        array[i][j] = -random.nextInt(10);
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int averageSum = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];

            }
        }


        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > sum) {
                    averageSum += array[i][j];
                    count++;
                }
            }
        }
        System.out.println("Сумма всех элементов: " + sum);
                    if (count>0) {
                        double avg = (double) averageSum / count;
                        System.out.println("Average = " + avg);
                    } else {
                        System.out.println("ne naideno");
                    }









    }

}
