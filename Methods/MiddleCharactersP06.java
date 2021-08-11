package Methods_excersise;

import java.util.Scanner;

public class MiddleCharactersP06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        printMiddleCharacters(input);
    }

    private static void printMiddleCharacters(String input) {
        if (input.length() % 2 == 0) {
            for (int i = (input.length() -1) / 2; i < (input.length() / 2) + 1; i++) {
                System.out.print(input.charAt(i));
            }
        } else {
            System.out.println(input.charAt(input.length() / 2));
        }
    }
}
