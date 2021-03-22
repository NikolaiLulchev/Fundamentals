package Arrays.Exercise;

import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < rotations; i++) {
            String firstNumber = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = firstNumber;
        }
        for (String num : array) {
            System.out.print(num + " ");
        }
    }
}
