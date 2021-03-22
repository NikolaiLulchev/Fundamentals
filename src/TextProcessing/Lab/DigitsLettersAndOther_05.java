package TextProcessing.Lab;

import java.util.Scanner;

public class DigitsLettersAndOther_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder isDigit = new StringBuilder();
        StringBuilder isLetter = new StringBuilder();
        StringBuilder isSymbol = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                isDigit.append(input.charAt(i));
            } else if (Character.isLetter(input.charAt(i))) {
                isLetter.append(input.charAt(i));
            } else {
                isSymbol.append(input.charAt(i));
            }
        }
        System.out.println(isDigit.toString());
        System.out.println(isLetter.toString());
        System.out.println(isSymbol.toString());
    }
}
