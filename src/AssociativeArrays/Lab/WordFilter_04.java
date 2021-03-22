package AssociativeArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] words = Arrays.stream(scanner.nextLine().split(" "))
                .filter(w -> w.length() % 2 == 0).toArray(String[]::new);
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            System.out.println(word);

        }
    }
}
