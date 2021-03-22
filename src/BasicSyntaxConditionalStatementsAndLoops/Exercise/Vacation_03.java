package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupCount = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String weekDay = scanner.nextLine();

        double priceForOne = 0.0;

        switch (groupType) {
            case "Students":
                if (weekDay.equals("Friday")) {
                    priceForOne = 8.45;
                } else if (weekDay.equals("Saturday")) {
                    priceForOne = 9.8;
                } else if (weekDay.equals("Sunday")) {
                    priceForOne = 10.46;
                }
                break;
            case "Business":
                if (weekDay.equals("Friday")) {
                    priceForOne = 10.9;
                } else if (weekDay.equals("Saturday")) {
                    priceForOne = 15.6;
                } else if (weekDay.equals("Sunday")) {
                    priceForOne = 16;
                }
                break;
            case "Regular":
                if (weekDay.equals("Friday")) {
                    priceForOne = 15;
                } else if (weekDay.equals("Saturday")) {
                    priceForOne = 20;
                } else if (weekDay.equals("Sunday")) {
                    priceForOne = 22.5;
                }
                break;
        }
        double totalPrice = 0.0;
        if (groupCount >= 30 && groupType.equals("Students")) {
            totalPrice = groupCount * priceForOne * 0.85;
        } else if (groupCount >= 100 && groupType.equals("Business")) {
            totalPrice = (groupCount - 10) * priceForOne;
        } else if ((groupCount >= 10 && groupCount <= 20) && groupType.equals("Regular")) {
            totalPrice = groupCount * priceForOne * 0.95;
        } else totalPrice = groupCount * priceForOne;
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
