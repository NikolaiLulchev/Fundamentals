package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Login_05 {
    private static Object StringBuilder;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        StringBuilder passwordBuilder = new StringBuilder();
        for (int i = user.length() - 1; i >= 0; i--) {
            char symbol = user.charAt(i);
            passwordBuilder.append(symbol);
        }
        String password = passwordBuilder.toString();
        String input = scanner.nextLine();
        int count = 0;

        while (!input.equals(password)) {
            count++;
            if (count == 4) {
                System.out.printf("User %s blocked!", user);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }
        if (input.equals(password)) {
            System.out.printf("User %s logged in.", user);
        }
    }
}