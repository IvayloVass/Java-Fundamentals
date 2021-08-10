package Arrays_excersise;

import java.util.Scanner;

public class TrainP01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] wagonNum = new int[Integer.parseInt(sc.nextLine())];
        int sumPeople = 0;
        for (int i = 0; i < wagonNum.length; i++) {
            wagonNum[i] = Integer.parseInt(sc.nextLine());
            sumPeople += wagonNum[i];

            System.out.print(wagonNum[i] + " ");
        }
        System.out.println();
        System.out.print(sumPeople);


    }
}
