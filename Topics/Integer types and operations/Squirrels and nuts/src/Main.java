import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //get two input
        int n = scanner.nextInt();
        throwExceptionIfInputLenIsTooLong(n);
        int k = scanner.nextInt();
        throwExceptionIfInputLenIsTooLong(n);

        // print out desired result
        System.out.println(k % n);

    }

    private static void throwExceptionIfInputLenIsTooLong(Integer integer) {

        if (integer > 10_000) {

            throw new RuntimeException("input can't be greater than 10000");
        }
    }
}