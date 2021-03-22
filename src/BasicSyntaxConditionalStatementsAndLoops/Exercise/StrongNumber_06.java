package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int startNum = number;
        int sumFact = 0;

        while (number != 0) {
            int digit = number % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sumFact += fact;
            number /= 10;
        }
        if (sumFact == startNum) {
            System.out.println("yes");
        } else System.out.println("no");
    }
}
