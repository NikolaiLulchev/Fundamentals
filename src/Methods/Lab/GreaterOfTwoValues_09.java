package Methods.Lab;

import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputType = scanner.nextLine();
        String firstValue = scanner.nextLine();
        String secondValue = scanner.nextLine();
        System.out.println(getMax(firstValue,secondValue));
    }

    static int getMax(int firstValue, int secondValue) {
        if (firstValue > secondValue) {
            return firstValue;
        } else return secondValue;
    }

    static char getMax(char firstValue, char secondValue) {
        if (firstValue > secondValue) {
            return firstValue;
        } else return secondValue;
    }

    static  String getMax(String firstValue,String secondValue){
        if (firstValue.compareTo(secondValue)>=0){
            return firstValue;
        }else return secondValue;
    }
}
