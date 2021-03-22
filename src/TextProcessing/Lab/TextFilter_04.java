package TextProcessing.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String bannedWord : bannedWords) {
            if (text.contains(bannedWord)) {
                StringBuilder wordOfStars = new StringBuilder();
                for (int i = 0; i < bannedWord.length(); i++) {
                    wordOfStars.append("*");
                }
                text = text.replace(bannedWord, wordOfStars);
            }

        }
        System.out.println(text);
    }
}
