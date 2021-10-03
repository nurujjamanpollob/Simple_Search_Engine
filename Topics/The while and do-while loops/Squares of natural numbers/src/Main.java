import java.util.Scanner;

class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = 1;
        int tmp = 1;

        do {

            result = pow(tmp);
            if (result <= n) {
                System.out.println(result);
            }
            tmp++;

        } while (result < n);


    }


    private static int pow(int pow) {

        int result = 0;

        for (int i = 0; i < pow; i++) {

            result += pow;
        }

        return result;
    }
}