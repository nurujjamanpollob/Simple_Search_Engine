import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int result = 0;

        while (sc.nextInt() != 0) {

            result++;
        }

        System.out.println(result);
    }
}