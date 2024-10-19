package osmiokt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class revenue {
    private static final String MILK = "Milk";
    private static final String BREAD = "Bread";
    private static final String WATER = "Water";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var productsWithQuantities = new HashMap<String, Integer>();
        productsWithQuantities.put(MILK, 0);
        productsWithQuantities.put(BREAD, 0);
        productsWithQuantities.put(WATER, 0);

        var productsWithPrices = new HashMap<String, Double>();
        productsWithPrices.put(MILK, 2.5);
        productsWithPrices.put(BREAD, 1.5);
        productsWithPrices.put(WATER, 1.0);

        double totalRevenue = 0.00;

        System.out.println("How many products would you like to purchase: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Products available: Milk (2.5 lv) / Bread (1.5 lv) / Water (1 lv)");

        for (int i = 0; i < n; i++) {
            System.out.println("Enter product to purchase: ");
            String currProduct = sc.nextLine();

            switch (currProduct){
                case MILK -> productsWithQuantities.compute(MILK, (k, v) -> (v == null) ? 1 : v + 1);
                case BREAD -> productsWithQuantities.compute(BREAD, (k, v) -> (v == null) ? 1 : v + 1);
                case WATER -> productsWithQuantities.compute(WATER, (k, v) -> (v == null) ? 1 : v + 1);
                default -> {
                    System.out.println("Invalid product. Please enter Milk, Bread, or Water.");
                    i--;
                }
            }

        }
        for (Map.Entry<String, Integer> entry : productsWithQuantities.entrySet()){
            var productQty = entry.getValue();
            var productPrice = productsWithPrices.get(entry.getKey());
            totalRevenue += productPrice * productQty;
        }

        System.out.printf("Total revenue is %.2f", totalRevenue);
    }
}
