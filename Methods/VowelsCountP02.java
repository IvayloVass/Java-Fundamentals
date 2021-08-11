package Methods_excersise;

import java.util.Scanner;

public class VowelsCountP02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        printVowelsNum(input);
    }

    private static void printVowelsNum(String input) {
        int count = 0;
        for (int index = 0; index < input.length(); index++) {
            char currentLetter = input.charAt(index);
            switch (currentLetter) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'u':
                case 'U':
                case 'o':
                case 'O':
                    count++;

            }

        }
        System.out.println(count);
    }
}
