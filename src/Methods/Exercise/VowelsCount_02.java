package Methods.Exercise;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase();

        printVowelCount(word);
    }

    private static void printVowelCount(String word) {
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            switch (letter) {
                case 'a':
                case 'e':
                case 'u':
                case 'i':
                case 'o':
                    counter++;
                    break;
            }

        }
        System.out.println(counter);
    }
}
