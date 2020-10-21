public class Word {
    private String wordLookup;
    private String wordDef;

    Word() {
        this.wordLookup = "";
        this.wordDef = "";

    }


    Word(String wordLookup, String wordDef) {
        this.wordDef=wordDef;
        this.wordLookup=wordDef;
    }

    public String getWordLookup(){
        return this.wordLookup;

    }
    public String getWordDef(){
        return this.wordDef;

    }
    public void setWordLookup(String wordLookup) {
        this.wordLookup = wordLookup;
    }
    public void setWordDef(String wordDef) {
        this.wordDef = wordDef;
    }



}
