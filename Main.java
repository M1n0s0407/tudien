import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Dictionary minhchimto = new Dictionary();
        DictionaryCommandline Command = new DictionaryCommandline();
        DictionaryManagement.insertFromCommandline(minhchimto);
        DictionaryManagement.insertFromFile();

    }
}
