package Methods_excersise;

import java.util.Scanner;

public class SmallestOfTreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = Integer.parseInt(sc.nextLine());
        int secondNum = Integer.parseInt(sc.nextLine());
        int thirdNum = Integer.parseInt(sc.nextLine());
        printSmallestNum(firstNum, secondNum, thirdNum);
    }

    private static void printSmallestNum(int firstNum, int secondNum, int thirdNum) {
        if (firstNum < secondNum && firstNum < thirdNum) {
            System.out.println(firstNum);
        } else if (secondNum < firstNum && secondNum < thirdNum) {
            System.out.println(secondNum);
        } else {
            System.out.println(thirdNum);
        }
    }
}
