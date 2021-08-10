package Arrays_excersise;

import java.util.Scanner;

public class ArrayRotationP04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int rotations = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < rotations; i++) {
            String firstElement = input[0];
            for (int j = 0; j < input.length - 1; j++) {
                input[j] = input[j + 1];
            }
            input[input.length - 1] = firstElement;
        }
        System.out.println(String.join(" ", input));
    }
}
