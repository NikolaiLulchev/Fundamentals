package Methods.Lab;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double totalPrice = productPrice(product) * quantity;
        System.out.printf("%.2f", totalPrice);
    }

    private static double productPrice(String product) {
        double productPrice = 0.00;
        switch (product) {
            case "coffee":
                productPrice = 1.50;
                break;
            case "water":
                productPrice = 1.00;
                break;
            case "coke":
                productPrice = 1.40;
                break;
            case "snacks":
                productPrice = 2.00;
                break;
        }
        return productPrice;

    }
}
