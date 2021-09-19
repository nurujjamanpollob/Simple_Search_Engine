import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean result = false;

        if (a == b && a == c) {

            result = true;
        }

        if (a < b && b > c) {
            result = true;
        }
        if (a > b && b < c) {

            result = true;
        }

        System.out.println(result);


    }
}