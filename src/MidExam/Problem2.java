package MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cookies = scanner.nextLine().split(", ");
        String command = scanner.nextLine();
        while (!command.equals("Eat")) {
            String[] tokens = command.split("\\s+");
            //Remove BBB 3
            //Update-Last Healthy
            //Rearrange Walnuts
            //Eat
            switch (tokens[0]) {
                case "Update-Any":
                    for (int i = 0; i < cookies.length; i++) {
                        if (cookies[i].equals(tokens[1])) {
                            cookies[i] = "Out of stock";
                            break;
                        }
                    }
                    break;
                case "Remove":
                    cookies[Integer.parseInt(tokens[2])] = tokens[1];
                    break;
                case "Update-Last":
                    cookies[cookies.length - 1] = tokens[1];
                    break;
                case "Rearrange":
                    for (int i = 0; i < cookies.length; i++) {
                        if (cookies[i].equals(tokens[1])) {
                            String moveToLast = cookies[i];
                            cookies[i] = cookies[i + 1];
                            cookies[cookies.length - 1] = moveToLast;
                        }

                    }
                    break;

            }


            command = scanner.nextLine();
        }
        for (String biscuit : cookies) {
            if (!biscuit.equals("Out of stock")) {
                System.out.print(String.join(" ", cookies));
            }
        }
        //  System.out.println(String.join(" ", cookies));
    }
}
