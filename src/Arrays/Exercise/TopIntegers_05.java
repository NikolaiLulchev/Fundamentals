package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();


        for (int index = 0; index <= array.length - 1; index++) {
            int number = array[index];

            if (index == array.length - 1) {
                System.out.print(number);
                break;
            }
            boolean isBigger = false;

            for (int i = index + 1; i <= array.length - 1; i++) {
                if (number > array[i]) {
                    isBigger = true;
                } else {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                System.out.print(number + " ");
            }
        }
    }
}
