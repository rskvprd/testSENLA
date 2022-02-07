package task3;

import java.util.ArrayList;
import java.util.Scanner;

public class SentenceWork {
    public static void main(String[] args) {
        System.out.println("Enter sentence:");
        Scanner scanner = new Scanner(System.in);
        String strUser = scanner.nextLine();
        ArrayList<WordVowel> wordVowels= new ArrayList<>();
        for (String word: strUser.split(" ")) {
            wordVowels.add(new WordVowel(upperFirst(word), countVowels(word)));
        }
        wordVowels.sort(new SortByVowels());
        System.out.println(wordVowels);

    }

    private static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c == 'а' || c == 'о' || c == 'у' || c == 'ы' || c == 'е' || c == 'я' || c == 'ю' || c == 'и' || c == 'ё' || c == 'э';
    }

    static int countVowels(String word){
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            counter += isVowel(word.charAt(i)) ? 1: 0;
        }
        return counter;
    }

    static String upperFirst(String word){
        for (int i = 0; i < word.length(); i++) {
            char let = word.charAt(i);
            if (isVowel(let)) {
                word = word.replaceFirst(Character.toString(let), Character.toString(Character.toUpperCase(let)));
                return word;
            }
        }
        return word;
    }
}
