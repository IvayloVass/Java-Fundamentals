package Arrays_excersise;

import java.util.Scanner;

public class ZigZagArrays_P03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            int firsNumber = Integer.parseInt(input.split(" ")[0]);
            int secondNumber = Integer.parseInt(input.split(" ")[1]);

            if ((i + 1) % 2 == 0) {
                arr1[i] = secondNumber;
                arr2[i] = firsNumber;
            } else {
                arr1[i] = firsNumber;
                arr2[i] = secondNumber;
            }

        }
        for (int number : arr1) {
            System.out.print(number + " ");

        }
        System.out.println();
        for (int number : arr2) {
            System.out.print(number + " ");

        }


    }
}

