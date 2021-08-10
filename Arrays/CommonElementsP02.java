package Arrays_excersise;

import java.util.Scanner;

public class CommonElementsP02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr1 = sc.nextLine().split(" ");
        String[] arr2 = sc.nextLine().split(" ");

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j].equals(arr2[i])) {
                    System.out.print(arr1[j] + " ");
                }
            }
        }
    }
}
