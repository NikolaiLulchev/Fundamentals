package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class PoundsToDollars_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gbp = Double.parseDouble(scanner.nextLine());
        double exchangeRate = 1.31;
        double dollar = gbp*exchangeRate;
        System.out.printf("%.3f",dollar);
    }
}
