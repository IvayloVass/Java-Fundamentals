package Arrays_excersise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSumP06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isFound = false;
        String[] input = sc.nextLine().split(" ");
        int[] array = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < array.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int leftIndex = 0; leftIndex < i; leftIndex++) {
                leftSum += array[leftIndex];
            }
            for (int rightIndex = i + 1; rightIndex < array.length; rightIndex++) {
                rightSum += array[rightIndex];
            }
            if (leftSum == rightSum) {
                isFound = true;
                System.out.println(i);
            }
        }
        if (!isFound) {
            System.out.println("no");
        }
    }
}