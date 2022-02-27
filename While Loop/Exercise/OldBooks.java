package Exercise;

import java.util.Scanner;

public class OldBooks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String myBook = scanner.nextLine();
        String book;
        int counter = 0;

        do {
            book = scanner.nextLine();
            counter ++;
            int count = counter - 1;
            if (book.equals(myBook)){
                System.out.println("You checked " + count +" books and found it.");
            }
            else if (book.equals("No More Books")){
                System.out.println("The book you search is not here!");
                System.out.println("You checked " + count + " books.");
                break;
            }
        }
        while (!myBook.equals(book));
        }
    }
