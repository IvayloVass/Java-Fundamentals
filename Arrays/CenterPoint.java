package Arrays_excersise;

import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = Integer.parseInt(sc.nextLine());
        int y1 = Integer.parseInt(sc.nextLine());
        int x2 = Integer.parseInt(sc.nextLine());
        int y2 = Integer.parseInt(sc.nextLine());

        int[] arr1 = {x1, y1};
        int[] arr2 = {x2, y2};
        int[] newArray = new int[2];

        newArray[0] = Math.min(arr1[0], arr2[0]);
        newArray[1] = Math.min(arr1[1], arr2[1]);

        System.out.printf("(%d, %d)", newArray[0], newArray[1]);

    }
}






