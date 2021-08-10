package Arrays_excersise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSumP08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] array = Arrays.stream(input).mapToInt(e -> Integer.parseInt(e)).toArray();
        int magicNum = Integer.parseInt(sc.nextLine());

        for (int index = 0; index <= array.length - 1; index++) {
            for (int i = index + 1; i <= array.length - 1; i++) {
                int sum = array[index] + array[i];
                if (sum == magicNum) {
                    System.out.printf("%d %d%n", array[index], array[i]);
                }

            }

        }
    }
}
