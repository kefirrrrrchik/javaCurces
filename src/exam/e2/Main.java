package exam.e2;
//Улитка поднимается по дереву на a футов в день.
// Затем каждую ночь улитка сползает вниз на b футов.
// Высота дерева — h футов.
//
//Напишите программу с подсчетом количества дней, которые потребуются улитке, чтобы добраться до вершины дерева.
//
//Если улитка не может добраться до вершины дерева, должно выводиться сообщение: Невозможно.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите а");
        int a = scanner.nextInt();
        System.out.println("Введите b");
        int b = scanner.nextInt();
        System.out.println("Введите h");
        int h = scanner.nextInt();

        if (a <= 0 || b <0 || h <= 0) {
            System.out.println("Все значения должны быть больше 0");
            return;
        }

        int distanceInDay = a - b;
        int distanceTravelled = 0;
        int countOfDays = 0;

        while (distanceTravelled < h) {
            distanceTravelled += distanceInDay;
            countOfDays++;
        }

        if (distanceInDay <= 0) {
            System.out.println("Невозможно");
        } else {
            System.out.println("Нужно дней: " + countOfDays);
        }
    }
}