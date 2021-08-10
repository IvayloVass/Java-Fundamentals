package Arrays_excersise;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dataType = sc.nextLine();
        if (dataType.equals("string")) {
            String input = sc.nextLine();
            printDollarSign(dataType, input);
        } else if (dataType.equals("int")) {
            int input = Integer.parseInt(sc.nextLine());
            int result = getIntMultiplication(dataType, input);
            System.out.println(result);
        } else {
            double input = Double.parseDouble(sc.nextLine());
            double result = getFloatMultiplication(dataType, input);
            System.out.printf("%.2f", result);
        }
    }

    private static double getFloatMultiplication(String dataType, double input) {
        return input * 1.5;
    }

    private static int getIntMultiplication(String dataType, int input) {
        return input * 2;
    }

    private static void printDollarSign(String dataType, String input) {
        System.out.println("$" + input + "$");
    }
}

