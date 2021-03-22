package Methods.Lab;

import java.util.Scanner;

public class PrintingTriangle_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printTriangle(n);
    }

    static void printSingleLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
    }

    private static void printTriangle(int n) {
        printTopHalf(n);
        printBottomHalf(n);
    }

    private static void printBottomHalf(int n) {
        for (int i = n; i > 0; i--) {
            printSingleLine(1, i);

        }
    }

    private static void printTopHalf(int n) {
        for (int i = 0; i < n; i++) {
            printSingleLine(1, i);

        }
    }
}
