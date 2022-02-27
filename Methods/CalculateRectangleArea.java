import java.util.Scanner;

public class CalculateRectangleArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        System.out.println(RectangleArea(width,height));

    }

    private static int RectangleArea(int width, int height) {

        return width * height;
    }
}
