import java.util.Scanner;

public class MuOnline {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int bitcoins = 0;
        String line = scanner.nextLine();
        String[] holder = line.split("\\|");
        String rooms = "";

        for (int i = 0; i < holder.length; i++) {
            if (i > 0) {
                rooms += " " + holder[i];
            } else {
                rooms += holder[i];
            }
        }

        String[] contains = rooms.split(" ");

        String command = "";
        int number = 0;
        int counter = 0;

        for (int i = 0; i < contains.length; i++) {

            if (i < contains.length - 1) {
                if (i % 2 == 0) {
                    command = contains[i];
                } else {
                    number = Integer.parseInt(contains[i]);
                }
            } else {
                if (i % 2 == 0) {
                    command = contains[contains.length - 2];
                } else {
                    number = Integer.parseInt(contains[contains.length - 1]);
                }
            }
            counter ++;

            if (counter % 2 == 0) {

                if (command.equals("potion")) {

                    if (health + number > 100){
                        int a = 100 - health;
                        System.out.println("You healed for " + a + " hp.");
                        health = 100;
                        System.out.println("Current health: " + health + " hp.");
                    }
                    else {
                        System.out.println("You healed for " + number + " hp.");
                        health += number;
                        System.out.println("Current health: " + health + " hp.");
                    }

                } else if (command.equals("chest")) {

                    bitcoins += number;
                    System.out.println("You found " + number + " bitcoins.");

                } else {
                    health -= number;
                    if (health <= 0) {
                        System.out.println("You died! Killed by " + command + ".");
                        break;
                    } else {
                        System.out.println("You slayed " + command + ".");
                    }
                }
            }
        }

        if (health <= 0){
            System.out.println("Best room: " + counter / 2);
        }
        else {
            System.out.println("You've made it!");
            System.out.println("Bitcoins: " + bitcoins);
            System.out.println("Health: " + health);
        }

    }
}