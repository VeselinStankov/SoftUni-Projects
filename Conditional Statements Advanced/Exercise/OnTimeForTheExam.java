package Exercise;

import java.util.Scanner;

public class OnTimeForTheExam {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());

        int diffHour;

        if (examHour == arrivalHour) {
            if (examMinute >= arrivalMinute && examMinute - arrivalMinute <= 30) {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", examMinute - arrivalMinute);
            } else if (examMinute >= arrivalMinute && examMinute - arrivalMinute > 30) {
                System.out.println("Early");
                System.out.printf("%d minutes before the start", examMinute - arrivalMinute);
            } else {
                System.out.println("Late");
                System.out.printf("%d minutes after the start", arrivalMinute - examMinute);
            }
        } else if (examHour < arrivalHour) {
            if (arrivalHour - examHour > 1) {
                diffHour = arrivalHour - examHour;
                if (examMinute > arrivalMinute) {
                    diffHour--;
                    System.out.println("Late");
                    System.out.printf("%d:%d hours after the start", diffHour, arrivalMinute + 60 - examMinute);
                } else if (arrivalMinute > examMinute) {
                    System.out.println("Late");
                    System.out.printf("%d:%d hours after the start", diffHour, arrivalMinute - examMinute);
                } else {
                    System.out.println("Late");
                    System.out.printf("%d:00 hours after the start", diffHour);
                }

            } else {
                if (examMinute > arrivalMinute) {
                    System.out.println("Late");
                    System.out.printf("%d minutes after the start", arrivalMinute + 60 - examMinute);
                } else if (arrivalMinute > examMinute) {
                    System.out.println("Late");
                    System.out.printf("%d:%d hours after the start", arrivalHour - examHour, arrivalMinute - examMinute);
                } else {
                    System.out.println("Late");
                    System.out.printf("%d:00 hours after the start", arrivalHour - examHour);
                }
            }
        }
        else {

            // examHour > arrivalHour;
            if ( examHour - arrivalHour > 1){
                diffHour =  examHour - arrivalHour;
                if (examMinute > arrivalMinute){
                    System.out.println("Early");
                    System.out.printf("%d:%d hours before the start",diffHour,examMinute - arrivalMinute);
                }
                else if (examMinute < arrivalMinute){
                    diffHour --;
                    System.out.println("Early");
                    System.out.printf("%d:%d hours before the start",diffHour,examMinute + 60 - arrivalMinute);
                }
                else{
                    System.out.println("Early");
                    System.out.printf("%d:00 hours before the start",diffHour);
                }
            }
            else {
                if (examMinute > arrivalMinute){
                    System.out.println("Early");
                    System.out.printf("1:%d hours before the start", examMinute - arrivalMinute);
                }
                else if (arrivalMinute > examMinute){
                    if (examMinute + 60 - arrivalMinute <= 30) {
                        System.out.println("On time");
                        System.out.printf("%d minutes before the start", examMinute + 60 - arrivalMinute);
                    }
                    else{
                        System.out.println("Early");
                        System.out.printf("%d minutes before the start", examMinute + 60 - arrivalMinute);
                    }
                }
                else {
                    System.out.println("Early");
                    System.out.println("1:00 hours before the start");
                }
            }
        }
    }
}
