package credit11;

import java.io.FileWriter;
import java.io.IOException;

//Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
public class Main {
    public static void main(String[] args) {


        try {
            FileWriter file = new FileWriter("text.txt");
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }

}
