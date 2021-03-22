package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class TownInfo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String townName = scanner.nextLine();
        int townPopulation = Integer.parseInt(scanner.nextLine());
        int townAre = Integer.parseInt(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.",townName,townPopulation,townAre);
    }
}
