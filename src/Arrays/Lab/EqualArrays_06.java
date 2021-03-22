package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();
        int[] secondArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();

        int sum = 0;
        boolean areIdentical = true;

        for (int index = 0; index <= firstArray.length - 1; index++) {
            if (firstArray[index] != secondArray[index]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", index);
                areIdentical = false;
                break;
            }
            sum += firstArray[index];
        }
        if (areIdentical) System.out.printf("Arrays are identical. Sum: %d", sum);

    }
}
