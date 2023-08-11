package credit11;
//Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("text.txt");
//            file.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\n");
//            file.write("Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.\n");
//            file.write("The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham.");
            file.write("Мама мыла раму, если солнечно. Все будет хорошо, я узнавала.");
            file.write(" Aevv, wfe: dvev. ");
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("text.txt"));
            String line;
            int countOfWords = 0;
            int countOfSymbols =0;

            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
                String[] words = line.split("[ ,.]");
                int countOfWordInLine = 0;
                for(String word : words) {
                    //System.out.println(word);
                    if (!word.isEmpty()) countOfWordInLine++;
                }
                countOfWords += countOfWordInLine;


                int countSymbolsInLine = 0;
                Pattern pattern = Pattern.compile("[-.?!)(,:;]");
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()){
                    countSymbolsInLine++;

                }
                countOfSymbols+=countSymbolsInLine;
            }
            System.out.println("кол-во слов = "+countOfWords);
            System.out.println("количество символов: "+ countOfSymbols);
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

