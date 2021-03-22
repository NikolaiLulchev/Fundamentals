package MidExam;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int journeyCost = Integer.parseInt(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double savedMoney = 0;

        for (int i = 1; i <= months; i++) {
            if (i % 2 != 0 & i != 1) {
                savedMoney *= 0.84;
            }
            if (i % 4 == 0) {
                savedMoney *= 1.25;
            }
            savedMoney += journeyCost * 0.25;


        }
        if (savedMoney >= journeyCost) {
            System.out.printf("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.", savedMoney - journeyCost);
        } else {
            System.out.printf("Sorry. You need %.2flv. more.", journeyCost - savedMoney);
        }
    }
}
