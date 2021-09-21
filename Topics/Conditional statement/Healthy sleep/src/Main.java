import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sleepLowLimit = scanner.nextInt();
        int sleepHiLimit = scanner.nextInt();
        int sleepHour = scanner.nextInt();

        if (sleepHour < sleepLowLimit) {

            System.out.println("Deficiency");
        }

        if (sleepHour > sleepHiLimit) {

            System.out.println("Excess");
        }

        if (sleepHour >= sleepLowLimit && sleepHour <= sleepHiLimit) {

            System.out.println("Normal");
        }

    }
}