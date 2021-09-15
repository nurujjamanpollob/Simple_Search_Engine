import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int getFirstHour = scanner.nextInt();
        int getFirstMinute = scanner.nextInt();
        int getFirstSecond = scanner.nextInt();

        // let's do conversation
        int firstTimeToSeconds = (60 * getFirstHour + getFirstMinute) * 60 + getFirstSecond;

        int getSecondHour = scanner.nextInt();
        int getSecondMinute = scanner.nextInt();
        int getSecondSecond = scanner.nextInt();

        // let's do conversation
        int secondTimeToSeconds = (60 * getSecondHour + getSecondMinute) * 60 + getSecondSecond;

        System.out.println(secondTimeToSeconds - firstTimeToSeconds);
    }
}