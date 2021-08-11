package Methods_excersise;

import java.util.Scanner;

public class CharactersInRangeP03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char first = sc.nextLine().charAt(0);
        char second = sc.nextLine().charAt(0);
        printCharsInRange(first, second);
    }

    private static void printCharsInRange(char first, char second) {
        for (char i = (char) (first + 1); i <= second - 1; i++) {
            System.out.print(i + " ");
        }
        if (first > second) {
            for (char i = (char) (second + 1); i < first; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
