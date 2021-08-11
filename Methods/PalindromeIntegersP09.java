package Methods_excersise;

import java.util.Scanner;

public class PalindromeIntegersP09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        while (!command.equals("END")) {
            String num = command;
            boolean isPalindrome = palindromeCheck(num);
            System.out.println(isPalindrome);

            command = sc.nextLine();
        }
    }

    private static boolean palindromeCheck(String num) {
        String reversedNum = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            reversedNum += num.charAt(i);
        }
        if (reversedNum.equals(num)) {
            return true;
        }
        return false;
    }
}
