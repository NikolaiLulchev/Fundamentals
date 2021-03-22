package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();
        int counterMax = 0;
        int counter = 0;
        int maxSeqNum = 0;

        for (int index = 1; index <= numbers.length - 1; index++) {
            int num1 = numbers[index - 1];
            int num2 = numbers[index];

            if (num1 == num2) {
                counter++;
                if (counter > counterMax) {
                    counterMax = counter;
                    maxSeqNum = num1;
                }
            } else {
                counter = 0;
            }
        }
        for (int i = 0; i <= counterMax; i++) {
            System.out.print(maxSeqNum + " ");
        }
    }
}
