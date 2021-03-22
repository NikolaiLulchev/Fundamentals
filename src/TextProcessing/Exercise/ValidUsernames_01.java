package TextProcessing.Exercise;

import java.util.Scanner;
import java.util.stream.Stream;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        boolean isValid = false;
        for (String username : input) {
            if (username.length() >= 3 && username.length() <= 16) {
                for (int i = 0; i < username.length(); i++) {
                    if (Character.isLetterOrDigit(username.charAt(i))
                            && username.charAt(i) == '-'
                            && username.charAt(i) == '_') {
                        isValid = true;
                    } else {
                        isValid = false;
                    }
                }

            }
            if (isValid) {
                System.out.println(username);
            }
        }
    }
}
