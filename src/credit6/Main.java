package credit6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Найти максимальный и минимальные элементы массива и вывести их индексы на экран.
        System.out.println("введите длину массива");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] array = new int[a];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        printArray(array);

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];

            }

        }

       // System.out.println(max);

        int indexMax = 0;
        for (int i = 0; i < array.length; i++) {
         if(array[i]==max){
             indexMax = i;
         }
        }
        System.out.println("Индекс наибольшего: " + indexMax);
       // System.out.println(indexMax);


        int min = array[1];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
       // System.out.println(min);
        int indexMin = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i]==min){
                indexMin = i;
            }
        }

        System.out.println("Индекс наименьшего: "+indexMin);

    }


    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

    }



}
