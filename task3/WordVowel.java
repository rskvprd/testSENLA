package task3;

import java.util.Comparator;

public class WordVowel {
    public String word;
    public int vowelsCount;

    WordVowel(String word, int vowelsCount){
        this.word = word;
        this.vowelsCount = vowelsCount;
    }

    @Override
    public String toString(){
        return word + " (" + vowelsCount + " гласных)";
    }
}

class SortByVowels implements Comparator<WordVowel> {

    @Override
    public int compare(WordVowel o1, WordVowel o2) {
        return o2.vowelsCount - o1.vowelsCount;
    }
}
