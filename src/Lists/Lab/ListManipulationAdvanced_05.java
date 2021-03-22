package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] tokens = command.split(" ");

            switch (tokens[0]) {
                case "Contains":
                    if (numbers.contains(Integer.valueOf(tokens[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (tokens[1].equals("even")) {
                        for (Integer number : numbers) {
                            if (number % 2 == 0) {
                                System.out.print(number + " ");
                            }
                        }
                        System.out.println();
                    } else if (tokens[1].equals("odd")) {
                        for (Integer number : numbers) {
                            if (number % 2 != 0) {
                                System.out.print(number + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    if (tokens[1].equals("sum")) {
                        int sum = 0;
                        for (int number : numbers) {
                            sum += number;
                        }
                        System.out.println(sum);
                    }
                    break;
                case "Filter":
                    String condition = tokens[1];
                    switch (condition) {
                        case "<":
                            for (int number : numbers) {
                                if (number < Integer.parseInt(tokens[2])) {
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (int number : numbers) {
                                if (number > Integer.parseInt(tokens[2])) {
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int number : numbers) {
                                if (number <= Integer.parseInt(tokens[2])) {
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (int number : numbers) {
                                if (number >= Integer.parseInt(tokens[2])) {
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;

            }


            command = scanner.nextLine();
        }
    }
}
