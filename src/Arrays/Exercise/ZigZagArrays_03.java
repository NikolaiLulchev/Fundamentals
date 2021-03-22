package Arrays.Exercise;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String[] array1 = new String[n];
        String[] array2 = new String[n];

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            String firstNum = input[0];
            String secNum = input[1];

            if (i % 2 == 0) {
                //wt - pyr
                array1[i] = firstNum;
                array2[i] = secNum;
            } else {
                array1[i] = secNum;
                array2[i] = firstNum;
            }
        }
        System.out.println(String.join(" ", array1));
        System.out.println(String.join(" ", array2));
    }
}
