package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstRow = scanner.nextLine().split(" ");
        String[] secondRow = scanner.nextLine().split(" ");

        for (String word2R : secondRow) {
            for (String word1R : firstRow) {
                if (word2R.equals(word1R)) {
                    System.out.print(word2R + " ");
                    break;
                }
            }
        }
    }
}
