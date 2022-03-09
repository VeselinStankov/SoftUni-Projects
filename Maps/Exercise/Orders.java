package Exercise;

import java.util.*;

public class Orders {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> productMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        String[] data;
        String name;
        double price;
        int quantity;
        List<Double> priceQuantity = new ArrayList<>();

        while (!input.equals("buy")) {
            data = input.split(" ");
            name = data[0];
            price = Double.parseDouble(data[1]);
            quantity = Integer.parseInt(data[2]);
            priceQuantity.add(price);
            priceQuantity.add((double) quantity);

            if (!productMap.containsKey(name)) {
                productMap.put(name, new ArrayList<>());
                productMap.get(name).add(price);
                productMap.get(name).add((double)quantity);
            }
            else {
                productMap.get(name).set(0,price);
                productMap.get(name).set(1,productMap.get(name).get(1) + quantity);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<Double>> stringListEntry : productMap.entrySet()) {
            System.out.printf("%s -> %.2f\n",stringListEntry.getKey(),stringListEntry.getValue().get(0) * stringListEntry.getValue().get(1));
        }
    }
}
