package Methods.Lab;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(getMultipleOfEvensAndOdds(Math.abs(number)));
    }

    private static int getMultipleOfEvensAndOdds(int number) {
        int evenSum = getEvenSum(number);
        int oddSum = getOddSum(number);
        return evenSum * oddSum;
    }

    private static int getOddSum(int number) {
        int oddSum = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 1) {
                oddSum += digit;
            }
            number = number / 10;
        }
        return oddSum;
    }

    private static int getEvenSum(int number) {
        int evenSum = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            }
            number = number / 10;
        }
        return evenSum;
    }
}
