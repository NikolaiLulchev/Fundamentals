package Methods.Lab;

import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double area = getRectangleArea(height, width);
        System.out.printf("%.0f",area);
    }

    private static double getRectangleArea(double height, double width) {
        return height * width;
    }
}
