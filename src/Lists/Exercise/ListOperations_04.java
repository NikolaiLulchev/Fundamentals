package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            switch (tokens[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(tokens[1]));
                    break;
                case "Remove":
                    numbers.remove(Integer.parseInt(tokens[1]));
                    break;
                case "Insert":
                    if (isValidIndex(Integer.parseInt(tokens[2]), numbers.size())) {
                        numbers.add(Integer.parseInt(tokens[2]), Integer.parseInt(tokens[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    if (tokens[1].equals("right")) {
                        for (int i = 1; i <= Integer.parseInt(tokens[2]); i++) {
                            int lastNumber = numbers.get(numbers.size() - 1);
                            numbers.remove(numbers.size() - 1);
                            numbers.add(0, lastNumber);
                        }

                    } else if (tokens[1].equals("left")) {
                        for (int i = 1; i <= Integer.parseInt(tokens[2]); i++) {
                            int firstNumber = numbers.get(0);
                            numbers.remove(0);
                            numbers.add(firstNumber);
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        printList(numbers);
    }

    private static boolean isValidIndex(int index, int length) {
        return index >= 0 && index <= length - 1;

    }

    private static void printList(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
