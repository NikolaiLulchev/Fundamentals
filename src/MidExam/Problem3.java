package MidExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> bookShelf = Arrays.stream(scanner.nextLine().split("&")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            String[] tokens = command.split(" \\| ");
            switch (tokens[0]) {
                case "Add Book":
                    String bookToAdd = tokens[1];
                    if (!bookShelf.contains(bookToAdd)) {
                        bookShelf.add(0, bookToAdd);
                    }
                    break;
                case "Take Book":
                    bookShelf.remove(tokens[1]);

                    break;
                case "Swap Books":
                    Collections.swap(bookShelf, bookShelf.indexOf(tokens[1]), bookShelf.indexOf(tokens[2]));
                    break;
                case "Insert Book":
                    bookShelf.add(tokens[1]);
                    break;
                case "Check Book":
                    if (Integer.parseInt(tokens[1]) >= 0 & (Integer.parseInt(tokens[1]) < bookShelf.size())) {
                        System.out.println(bookShelf.get(Integer.parseInt(tokens[1])));
                    }
                    break;

            }


            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", bookShelf));

    }
}
