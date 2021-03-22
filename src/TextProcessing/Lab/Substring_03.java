package TextProcessing.Lab;

import java.util.Scanner;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String toRemove = scanner.nextLine();
        String toProcess = scanner.nextLine();

        while (toProcess.contains(toRemove)) {
            toProcess = toProcess.replace(toRemove, "");
        }
        System.out.println(toProcess);
    }
}
