package RegularExpressions_excersise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BarIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        double currentPrice = 0;
        double totalIncome = 0;
        while (!input.equals("end of shift")) {
            String regex = "%(?<customer>[A-X][a-z]+)%<(?<product>\\w+)>([|])(?<count>\\d)\\3(?<price>[0-9]+[.?][0-9])[$]";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                currentPrice = count * price;
                totalIncome += currentPrice;
                //  "{customerName}: {product} - {totalPrice}"
                System.out.printf("%s: %s - %.2f\n", customer, product, currentPrice);

            }

            input = sc.nextLine();
        }
        System.out.printf("Total income: %.2f", totalIncome);
    }
}
