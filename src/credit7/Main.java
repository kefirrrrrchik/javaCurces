package credit7;
import java.util.Random;
public class Main {
    //7.Создать массив заполнить его случайными элементами,
    // распечатать, перевернуть, и снова распечатать.
    // При перевороте элементов не желательно
    // создавать еще один массив.



    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }


        System.out.println("Массив: ");
        printArray(array);

      swapArr(array);

      printArray(array);

    }

    public static void swapArr(int[] a){
        int n = a.length;
        for (int i=0; i<n/2; i++){
        int buff = a[i];
        a[i] = a[n-1-i];
        a[n-1-i] = buff;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
