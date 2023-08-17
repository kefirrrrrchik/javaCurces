package exam.e8;
//Дано 2 файла - in1.txt и in2.txt в каждом файле по 1000 чисел от 1 до 100000. Создайте файл out.txt,
// который будет содержать все отсортированные числа из файлов in1.txt и in2.txt. Файлы in1.txt и in2.txt
// можно создать с помощью кода.

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[1000];
        try {
            FileWriter in1 = new FileWriter("in1.txt");

            for(int i = 0;i < array.length; ++i){

                array[i] = random.nextInt(100000);
               // System.out.println(array[i]);
                in1.write(Integer.toString(array[i]));
                in1.write(System.lineSeparator());
            }

            in1.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileWriter in2 = new FileWriter("in2.txt");

            for(int i = 0;i < array.length; ++i){

                array[i] = random.nextInt(100000);
               // System.out.println(array[i]);
                in2.write(Integer.toString(array[i]));
                in2.write(System.lineSeparator());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //
        //
    //ДОБАВИТЬ ЛОГИКУ
        //
        //

        try {
            FileWriter out = new FileWriter("out.txt");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
