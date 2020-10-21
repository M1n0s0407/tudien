import java.util.ArrayList;
import java.util.Arrays;

public class Dictionary {
    public int numofwords = 0;





    private ArrayList<Word> wordArrayList = new ArrayList<Word>();
    Dictionary(){}
    public void insertWord(Word insertword) {
        wordArrayList.add(insertword);
        return;
    }

    /**
     *
     * @return wordcount in int
     */
    public int getWordCount(){
        return this.wordArrayList.size();

    }

    public ArrayList<Word> getWords(){
        return wordArrayList;
    }

    public void insert(Word newWord) {
    }
    /*public Word getWordAt(int i){
        if (i<0||i>wordArrayList.size() -1){
            return null;
        }
        else{
            return wordArrayList.get(i);
        }
    }*/


}
