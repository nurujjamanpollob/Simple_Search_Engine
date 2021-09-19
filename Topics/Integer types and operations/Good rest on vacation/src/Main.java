import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int duration = scanner.nextInt();
        int costFoodPerDay = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        int costOfOneNightInHotel = scanner.nextInt();

        System.out.println(duration * costFoodPerDay + (duration - 1) * costOfOneNightInHotel +
                oneWayFlightCost * 2);
    }
}