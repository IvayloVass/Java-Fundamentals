package AssociativeArrays_exersise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String order = sc.nextLine();
        Map<String, Double> productList = new LinkedHashMap<>();
        Map<String, Integer> productQty = new LinkedHashMap<>();

        while (!order.equals("buy")) {
            String[] spitedOrder = order.split("\\s+");
            String productType = spitedOrder[0];
            double price = Double.parseDouble(spitedOrder[1]);
            int qty = Integer.parseInt(spitedOrder[2]);

            productList.put(productType, price);
            if (!productQty.containsKey(productType)) {
                productQty.put(productType, qty);
            } else {
                productQty.put(productType, productQty.get(productType) + qty);
            }

            order = sc.nextLine();
        }

        for (Map.Entry<String, Double> entry : productList.entrySet()) {
            double finalSum = entry.getValue() * productQty.get(entry.getKey());
            System.out.printf("%s -> %.2f\n", entry.getKey(), finalSum);

        }

    }
}
