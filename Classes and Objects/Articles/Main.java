package Exercise.Articles;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] words = line.split(", ");

        String title = words[0];
        String content = words[1];
        String author = words[2];

        ArticleClass article = new ArticleClass(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());
        String commandLine;
        String[] command;

        for (int i = 0; i < n; i++) {
            commandLine = scanner.nextLine();
            command = commandLine.split(": ");

            switch (command[0]) {

                case "Edit":
                    article.Edit(command[1]);
                    break;

                case "ChangeAuthor":
                    article.ChangeAuthor(command[1]);
                    break;

                case "Rename":
                    article.Rename(command[1]);
                    break;
            }
        }

        System.out.println(article.getTitle() + " - " + article.getContent() + ": " + article.getAuthor());

    }
}
