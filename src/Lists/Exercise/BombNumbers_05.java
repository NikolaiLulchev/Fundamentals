package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> bomb = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int bombNumber = bomb.get(0);
        int bombPower = bomb.get(1);

        int bombIndex = numbers.indexOf(bombNumber);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).equals(bombNumber)) {
                for (int j = 1; j <= bombPower; j++) {
                    numbers.remove(bombIndex + 1);

                }
                for (int j = 1; j <= bombPower; j++) {
                    numbers.remove(bombIndex - 1);
                    bombIndex -= 1;
                }
                numbers.remove(bombIndex);
            }
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
