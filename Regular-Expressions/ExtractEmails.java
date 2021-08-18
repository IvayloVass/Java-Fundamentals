package RegularExpressions_excersise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String regex = "\\b[A-Za-z]+.?[A-Za-z-]+@[A-Za-z-]+\\.[a-z]+\\.?\\w+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {

            System.out.println(matcher.group() + " ");
        }
    }
}
