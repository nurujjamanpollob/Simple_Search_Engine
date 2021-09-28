import java.util.Scanner;

class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        long result = 1;

        for (; a < b; a++) {

            result *= a;
        }

        System.out.println(result);

    }
}