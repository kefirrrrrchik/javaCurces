package exam.e4;
//Дан текст. Подсчитайте уникальное количество слов в тексте.
// Учитывайте, что слова могут разделяться несколькими пробелами, знаками препинания.
//Пробелы могут присутствовать так же в начале и конце текста.

public class Main {
    public static void main(String[] args) {

        String text = "  Мама мыла раму, если !    !солнечно. Все :будет хорошо, я узнавала. ";
        int countOfWords = 0;

        String[] words = text.split("[ -.?!;)(,:]");

        for (String word: words){
            if (!word.isEmpty()) countOfWords++;

        }
        System.out.println("Kоличество слов: "+countOfWords);
    }
}
