package Methods_excersise;

import java.util.Scanner;

public class FactorialDivisionP08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstDigit = Double.parseDouble(sc.nextLine());
        double secondDigit = Double.parseDouble(sc.nextLine());

        double firstFactorial = getFirstFactorial(firstDigit);
        double secondFactorial = getSecondFactorial(secondDigit);
        double result = dividedFactorial(firstFactorial, secondFactorial);
        System.out.printf("%.2f", result);

    }

    private static double getFirstFactorial(double firstDigit) {
        double factorial = 1;
        for (double i = firstDigit; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    private static double getSecondFactorial(double secondDigit) {
        double factorial = 1;
        for (double i = secondDigit; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    private static double dividedFactorial(double firstFactorial, double secondFactorial) {
        return firstFactorial / secondFactorial;
    }

}
