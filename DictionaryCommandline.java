import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryCommandline {
    public static void showAllwords(Dictionary dictionary){
        System.out.println("DictionaryCommandline.showAllwords");
        ArrayList<Word> dictionaryArrayList = dictionary.getWords();

        if (dictionaryArrayList.isEmpty()) {
            System.out.println("\nDictionary is empty\n");
        }
        else {
            int dictWordCount = dictionary.getWordCount();
            System.out.printf("No.\tEnglish\tVietnamese\n");
            for(int i = 0; i<dictWordCount;i++){
                Word current = dictionaryArrayList.get(i);
                System.out.printf("%d\t%s\t%s\n", i+1, current.getWordLookup(), current.getWordDef());

            }
        }
    }

    public static void dictionaryBasic(Dictionary dictionary) {
        System.out.println("DictionaryCommandline.dictionaryBasic");
        Scanner sc = new Scanner(System.in);
        System.out.printf("\n Dictionary v1");
        DictionaryManagement.insertFromCommandline(dictionary);
        DictionaryCommandline.showAllwords(dictionary);
        sc.close();
    }

}
