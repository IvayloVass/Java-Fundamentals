package TextProcessing_excersise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String firstWord = input.split("\\s+")[0];
        String secondWord = input.split("\\s+")[1];
        double sum = calculations(firstWord, secondWord);
        System.out.printf("%.0f", sum);

    }

    private static double calculations(String firstWord, String secondWord) {
        int closerWord = Math.min(firstWord.length(), secondWord.length());
        int sum = 0;
        for (int length = 0; length < closerWord; length++) {
            double multiply = 0;
            int numFirstWord = (int) firstWord.charAt(length);
            int numSecondWord = (int) secondWord.charAt(length);
            multiply = numFirstWord * numSecondWord;
            sum += multiply;
        }
        int diff = 0;
        if (firstWord.length() > secondWord.length()) {
            diff = firstWord.length() - secondWord.length();
            for (int i = closerWord - 1; i < diff; i++) {
                sum += firstWord.charAt(i);
            }
        } else if (firstWord.length() < secondWord.length()) {
            diff = secondWord.length() - firstWord.length();
            for (int i = closerWord - 1; i < diff; i++) {
                sum += secondWord.charAt(i);
            }
        }
        return sum;
    }
}