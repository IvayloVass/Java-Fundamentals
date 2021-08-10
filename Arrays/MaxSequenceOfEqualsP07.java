package Arrays_excersise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualsP07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] array = Arrays.stream(input).mapToInt(e -> Integer.parseInt(e)).toArray();
        int length = 1;
        int maxLength = 0;
        int startIndex = 0;
        int bestIndex = 0;

        for (int index = 1; index <= array.length - 1; index++) {
            if (array[index] == array[index - 1]) {
                length++;
            } else {
                length = 1;
                startIndex = index;
            }
            if (length > maxLength) {
                maxLength = length;
                bestIndex = startIndex;
            }
        }
        for (int i = bestIndex; i < bestIndex + maxLength; i++) {
            System.out.print(array[i] + " ");

        }
    }
}
