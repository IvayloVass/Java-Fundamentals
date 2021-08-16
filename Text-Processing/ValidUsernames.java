package TextProcessing_excersise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(", ");
        for (String password : input) {
            boolean validation = isValid(password);
            if (validation) {
                System.out.println(password);
            }

        }
    }

    private static boolean isValid(String password) {
        for (int index = 0; index < password.length(); index++) {
            char currentSymbol = password.charAt(index);
            if (!Character.isLetterOrDigit(currentSymbol) && currentSymbol != '-' && currentSymbol != '_') {
                return false;
            }
        }
        if (password.length() < 3 || password.length() > 16) {
            return false;
        }
        return true;

    }
}
