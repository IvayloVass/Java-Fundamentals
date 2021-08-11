package Methods_excersise;

import java.util.Scanner;

public class AddAndSubtractP05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = Integer.parseInt(sc.nextLine());
        int second = Integer.parseInt(sc.nextLine());
        int third = Integer.parseInt(sc.nextLine());
        int sum = sumElements(first, second);
        int subtract = subtractElement(sum, third);
        System.out.println(subtract);
    }

    private static int subtractElement(int sum, int third) {
        return sum - third;
    }

    private static int sumElements(int first, int second) {
        return first + second;
    }
}
