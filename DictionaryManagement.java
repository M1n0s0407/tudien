

import java.io.*;

import java.util.Scanner;

public class DictionaryManagement {

    /**
     * Function to get user input.
     * Insert new words and its meaning to dictionary (passed to func)
     * @param dictionary Dictionary to insert word to
     */
    static void insertFromCommandline(Dictionary dictionary) {
        int numofwords = 0;
        System.out.println("Enter number of word add: ");
        Scanner inputnum = new Scanner(System.in);
        numofwords = inputnum.nextInt();
        Word newWord;
        String insertWord;
        String insertDef;

        inputnum.nextLine();
        for (int i = 0; i < numofwords; i++) {
            System.out.println("InsertWord: ");
            insertWord = inputnum.nextLine();
            System.out.println("InsertDefinition: ");
            insertDef = inputnum.nextLine();
            newWord = new Word(insertWord, insertDef);
            dictionary.insert(newWord);

        }

        inputnum.close();
        return;
    }


    public static void insertFromFile() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\ngbmi\\Dict\\tudien1.txt");

        int i;
        while ((i = fr.read()) != -1)
            System.out.print((char) i);
    }


}
