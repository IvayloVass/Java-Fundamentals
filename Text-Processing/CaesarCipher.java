package TextProcessing_excersise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder build = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char encryptedSymbol = (char) (input.charAt(i) + 3);
            build.append(encryptedSymbol);
        }
        System.out.println(build);

    }
}
