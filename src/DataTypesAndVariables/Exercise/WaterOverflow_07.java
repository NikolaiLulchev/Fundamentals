package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = 255;
        int n = Integer.parseInt(scanner.nextLine());
        int freeVolume = capacity;
        for (int i = 1; i <= n; i++) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (freeVolume >= quantity) {
                freeVolume -= quantity;
            } else System.out.println("Insufficient capacity!");

        }
        System.out.println(capacity-freeVolume);
    }
}
