package Methods.Lab;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        repeatString(text, n);
    }

    private static void repeatString(String text, int n) {
        String repeatedString = "";
        for (int i = 0; i < n; i++) {
            System.out.print(text);

        }
    }
}
