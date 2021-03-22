package AssociativeArrays.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//String input = scanner.nextLine().split(" ")
        Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((n1, n2) -> n2.compareTo(n1))
                .limit(3)
                .forEach(e -> System.out.print(e + " "));
    }
}
