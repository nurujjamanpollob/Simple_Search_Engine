import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = n;
        int k = scanner.nextInt();
        int result = 0;

        while (count <= k) {
            count += n;
            result++;

        }

        System.out.println(result);

    }
}