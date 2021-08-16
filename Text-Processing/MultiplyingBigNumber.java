package TextProcessing_excersise;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyingBigNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger firstNum = new BigInteger(sc.nextLine());
        BigInteger secondNum = new BigInteger(sc.nextLine());
        System.out.println(firstNum.multiply(secondNum));

    }

}
