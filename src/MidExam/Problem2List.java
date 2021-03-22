package MidExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem2List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> cookies = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("Eat")) {
            String[] tokens = command.split("\\s+");
            //Remove BBB 3
            //Update-Last Healthy
            //Rearrange Walnuts
            //Eat
            switch (tokens[0]) {
                case "Update-Any":
                    for (int i = 0; i < cookies.size(); i++) {
                        if (cookies.get(i).equals(tokens[1])) {
                            cookies.set(i, "Out of stock");
                            break;
                        }
                    }
                    break;
                case "Remove":
                    cookies.set(Integer.parseInt(tokens[2]), tokens[1]);
                    break;
                case "Update-Last":
                    cookies.set(cookies.size() - 1, tokens[1]);
                    break;
                case "Rearrange":
                    cookies.remove(tokens[1]);
                    cookies.add(tokens[1]);

                    break;

            }


            command = scanner.nextLine();
        }
        cookies.removeAll(Collections.singleton("Out of stock"));
        System.out.println(String.join(" ", cookies));
    }
}
