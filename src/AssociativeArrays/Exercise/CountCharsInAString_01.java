package AssociativeArrays.Exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<Character, Integer> symbolCount = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (symbol == ' ') {
                continue;
            }
            if (!symbolCount.containsKey(symbol)) {
                symbolCount.put(symbol, 1);
            } else {
                symbolCount.put(symbol, symbolCount.get(symbol) + 1);
            }
        }
        for (Map.Entry<Character, Integer> characterIntegerEntry : symbolCount.entrySet()) {
            System.out.printf("%c -> %d%n", characterIntegerEntry.getKey(), characterIntegerEntry.getValue());
        }
    }
}
