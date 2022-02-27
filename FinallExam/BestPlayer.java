import java.util.Scanner;

public class BestPlayer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String player = " ";
        int goals = 0;
        int maxGoals = 0;
        String bestPlayer = " ";

        while (goals < 10){

            player = scanner.nextLine();
            if (player.equals("END")){
                break;
            }
            goals = Integer.parseInt(scanner.nextLine());
            if (goals > maxGoals){
                maxGoals = goals;
                bestPlayer = player;
            }

        }

        System.out.printf("%s is the best player!\n",bestPlayer);
        if (maxGoals >= 3){
            System.out.printf("He has scored %d goals and made a hat-trick !!!",maxGoals);
        }
        else {
            System.out.printf("He has scored %d goals.",maxGoals);
        }
    }
}
