package MyMidExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheAngryCat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] array = line.split(", ");
        List <Integer> items = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            items.add(Integer.parseInt(array[i]));
        }

        int entryPoint = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < items.size(); i++) {
            if (i == entryPoint) {
                for (int j = entryPoint - 1; j >= 0 ; j --) {
                    if (type.equals("cheap")) {
                        if (items.get(j) < items.get(entryPoint)) {
                            leftSum += items.get(j);
                        }
                    }
                    else {
                        if (items.get(j) >= items.get(entryPoint)) {
                            leftSum += items.get(j);
                        }
                    }
                }

                for (int j = entryPoint + 1; j < items.size(); j++) {
                    if (type.equals("cheap")) {
                        if (items.get(j) < items.get(entryPoint)) {
                            rightSum += items.get(j);
                        }
                    }
                    else {
                        if (items.get(j) >= items.get(entryPoint)) {
                            rightSum += items.get(j);
                        }
                    }
                }
            }
        }

        if (leftSum > rightSum) {
            System.out.println("Left - " + leftSum);
        }
        else if (rightSum > leftSum) {
            System.out.println("Right - " + rightSum);
        }
        else {
            System.out.println("Left - " + leftSum);
        }


    }
}
