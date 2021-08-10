package Arrays_excersise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegersP05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] array = Arrays.stream(input).mapToInt(e -> Integer.parseInt(e)).toArray();
        int maxIndex = Integer.MIN_VALUE;
        int currentIndex = 0;

        for (int i = 0; i < array.length; i++) {
            int currentValue = array[i];
            if (currentValue > maxIndex) {
                maxIndex = currentValue;
                currentIndex = i;
            }

        }
        for (int j = currentIndex; j < array.length; j++) {
            System.out.print(array[j] + " ");

        }

    }
}

