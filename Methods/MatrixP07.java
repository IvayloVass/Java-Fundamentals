package Methods_excersise;

import java.util.Scanner;

public class MatrixP07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int column = 1; column <= n; column++) {
            for (int row = 1; row <= n; row++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
