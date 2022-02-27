package Exercise;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random rand = new Random();

        int indexPhrases = rand.nextInt(phrases.length);
        int indexEvents = rand.nextInt(events.length);
        int indexAuthors = rand.nextInt(authors.length);
        int indexCities = rand.nextInt(cities.length);

        for (int i = 0; i < n ; i++) {
            System.out.println(phrases[indexPhrases] + " " + events[indexEvents] + " " + authors[indexAuthors] + " - " + cities[indexCities]);
        }
    }
}
