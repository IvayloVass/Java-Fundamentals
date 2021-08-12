package List_excersise;
import java.util.Arrays;
import java.util.Scanner;

public class CarRace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] timeToPass = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        double leftSum = 0.0;
        double rightSum = 0.0;
        for (int index = 0; index < timeToPass.length / 2; index++) {
            leftSum += timeToPass[index];
            if (timeToPass[index] == 0) {
                leftSum *= 0.8;
            }
        }
        for (int index = timeToPass.length - 1; index > timeToPass.length / 2; index--) {
            rightSum += timeToPass[index];
            if (timeToPass[index] == 0) {
                rightSum *= 0.8;
            }
        }

        if (leftSum < rightSum) {

            System.out.printf("The winner is left with total time: %.1f", leftSum);
        } else {
            System.out.printf("The winner is right with total time: %.1f", rightSum);
        }


    }
}
