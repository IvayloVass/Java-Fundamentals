package Methods_excersise;

import java.util.Scanner;

public class PasswordValidatorP04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        boolean isValid = charactersCheck(password);
        if (!isValid) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        boolean areOnlyLettersOrDigits = LettersAndDigitsCheck(password);
        if (!areOnlyLettersOrDigits) {
            System.out.println("Password must consist only of letters and digits");
        }
        boolean hasTwoDigits = digitsNumCheck(password);
        if (!hasTwoDigits) {
            System.out.println("Password must have at least 2 digits");
        }
        if (isValid && areOnlyLettersOrDigits && hasTwoDigits) {
            System.out.println("Password is valid");
        }
    }

    private static boolean digitsNumCheck(String password) {
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            char currentSymbol = password.charAt(i);
            if (Character.isDigit(currentSymbol)) {
                counter++;
            }
            if (counter >= 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean LettersAndDigitsCheck(String password) {
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            char currentSymbol = password.charAt(i);
            if (Character.isLetter(currentSymbol) || Character.isDigit(currentSymbol)) {
                counter = 0;
            } else {
                counter++;
            }
            if (counter > 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean charactersCheck(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }
}

