package credit8;

import java.util.Arrays;

//
//Дан текст. Поменяйте местами первое самое длинное слово с последним самым коротким.
//
public class Main {
    public static void main(String[] args) {

        String text = "A sign in attempt, requires further verification, because we did not recognize your device.";

        System.out.println(text);
        String[] words = text.split(" ");

            int maxLength = 0;
            int minLength = 100;
            int maxN = 0;
            int minN = 0;


        for(int i=0; i<words.length; i++)
        {
            int currentLength = words[i].length();
            if (maxLength < currentLength)
            {
                maxLength = currentLength;
                maxN = i;
            }
            if (minLength >= currentLength)
            {
                minLength = currentLength;
                minN = i;
            }
        }

        String buffer = words[maxN];
        words[maxN] = words[minN];
        words[minN] = buffer;



       // System.out.println(Arrays.toString(words));

        String result = "";
        for(String word : words)
            result += word+" ";

        System.out.println(result);


    }
}
