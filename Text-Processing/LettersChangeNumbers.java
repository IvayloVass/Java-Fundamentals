package TextProcessing_excersise;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        double totalSum = 0;
        for (String password : input) {
            double currentSum = getModifiedNumber(password);
            totalSum += currentSum;

        }
        System.out.printf("%.2f", totalSum);

    }

    private static double getModifiedNumber(String password) {
        char firstLetter = password.charAt(0);
        char secondLetter = password.charAt(password.length() - 1);
//        int number = Integer.parseInt(password.replace(firstLetter, ' ').replace(secondLetter, ' ').trim());
        StringBuilder builder = new StringBuilder(password);
        double number = Double.parseDouble(builder.deleteCharAt(0).deleteCharAt(builder.length() - 1).toString());
        if (Character.isUpperCase(firstLetter)) {
            int positionFirstLetter = firstLetter - 64;
            number = number / positionFirstLetter;

        } else {
            int positionLowerLetter = firstLetter - 96;
            number = number * positionLowerLetter;

        }
        if (Character.isUpperCase(secondLetter)) {
            int positionUpperLetter = secondLetter - 64;
            number = number - positionUpperLetter;

        } else {
            int positionLowerLetter = secondLetter - 96;
            number = number + positionLowerLetter;

        }

        return number;
    }

}

