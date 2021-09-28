import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int st = scanner.nextInt();

        int[] inputs = new int[st];

        for (int i = 0; i < st; i++) {

            inputs[i] = scanner.nextInt();


        }

        Arrays.sort(inputs);

        int two = 2;

        // print 2 count
        int tmp = 0;
        for (int d : inputs) {
            if (d == two) {
                tmp += 1;
            }
        }
        System.out.print(tmp);
        System.out.print(' ');
        tmp = 0;


        // print 3 count
        int three = 3;
        for (int c : inputs) {
            if (c == three) {
                tmp += 1;
            }
        }
        System.out.print(tmp);
        System.out.print(' ');
        tmp = 0;


        // print 4 count
        int four = 4;
        for (int b : inputs) {
            if (b == four) {
                tmp += 1;
            }
        }
        System.out.print(tmp);
        System.out.print(' ');
        tmp = 0;


        // print 5 count
        int five = 5;
        for (int a : inputs) {
            if (a == five) {
                tmp += 1;
            }
        }
        System.out.print(tmp);



    }
}