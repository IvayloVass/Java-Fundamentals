package RegularExpressions_excersise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        double totalExpenses = 0;
        System.out.println("Bought furniture:");

        while (!input.equals("Purchase")) {
            String regex = ">>\\b(?<furniture>\\w+)<<(?<price>[0-9]+.?[0-9]*)!(?<quantity>[0-9]+)\\b";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String boughtFurniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int qty = Integer.parseInt(matcher.group("quantity"));
                totalExpenses += price * qty;
                System.out.println(boughtFurniture);
            }
            input = sc.nextLine();
        }

        System.out.printf("Total money spend: %.2f", totalExpenses);


    }
}
