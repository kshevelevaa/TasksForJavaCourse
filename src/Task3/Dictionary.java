package Task3;

public class Dictionary {
    private String word;
    private int vowelCount;
    public Dictionary(String w, int vC){
           word=w;
           vowelCount=vC;
    }

    public int getVowelCount() {
        return vowelCount;
    }

    public String getWord() {
        return word;
    }
}
