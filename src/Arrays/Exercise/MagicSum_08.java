package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();
        int sum = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index <= numbers.length - 1; index++) {
            for (int i = index + 1; i <= numbers.length - 1; i++) {
                if (numbers[index] + numbers[i] == sum) {
                    System.out.printf("%d %d%n", numbers[index], numbers[i]);
                }
            }
        }
    }
}
