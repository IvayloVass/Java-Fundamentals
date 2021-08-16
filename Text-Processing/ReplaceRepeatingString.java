package TextProcessing_excersise;

import java.util.Scanner;

public class ReplaceRepeatingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder sequence = new StringBuilder();
        char firstChar = input.charAt(0);
        sequence.append(firstChar);
        for (int i = 1; i <= input.length() - 1; i++) {
            if (input.charAt(i) != firstChar) {
                char nextChar = input.charAt(i);
                sequence.append(nextChar);
                firstChar = nextChar;
            }

        }
        System.out.println(sequence);
    }
}
