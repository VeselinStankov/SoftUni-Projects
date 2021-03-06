import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOfProducts {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> productList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            productList.add(scanner.nextLine());
        }

        Collections.sort(productList);
        int counter = 1;

        for (int i = 0; i < productList.size(); i++) {
            System.out.println(counter + "." + productList.get(i));
            counter ++;
        }

    }
}
