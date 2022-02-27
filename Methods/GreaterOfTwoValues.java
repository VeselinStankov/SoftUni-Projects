import java.util.Scanner;

public class GreaterOfTwoValues {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        getMax(type,a,b);


    }

    private static void getMax(String type, String a, String b) {

        switch (type){

            case "int":
                int c = Integer.parseInt(a);
                int d = Integer.parseInt(b);
                if (c > d){
                    System.out.println(a);
                }
                else if (d > c){
                    System.out.println(b);
                }
                break;

            case "char":
                int e = a.charAt(0);
                int f = b.charAt(0);
                if (e > f){
                    System.out.println(a);
                }
                else if (f > e){
                    System.out.println(b);
                }
                break;

            case "string":
                if (a.compareTo(b) >= 0){
                    System.out.println(a);
                }
                else {
                    System.out.println(b);
                }
        }

    }
}
