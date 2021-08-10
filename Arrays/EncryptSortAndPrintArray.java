package Arrays_excersise;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[number];

        for (int i = 0; i < number; i++) {
            String names = scanner.nextLine();
            int sum = 0;

            for (int j = 0; j < names.length(); j++) {
                char name = names.charAt(j);

                if (name == 'a' || name == 'A' || name == 'e' || name == 'E' || name == 'i'
                        || name == 'I' || name == 'o' || name == 'O' || name == 'u' || name == 'U') {

                    sum += name * names.length();
                } else {
                    sum += name / names.length();
                }
            }
            numbers[i] = sum;
        }
        Arrays.sort(numbers);
        for (int index : numbers) {
            System.out.println(index);
        }
    }
}

