import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // get first input
        int a = sc.nextInt();

        // get second input
        int b = sc.nextInt();

        // get third input
        int c = sc.nextInt();

        // get fourth input
        int d = sc.nextInt();

        // let's output all the integer roots between 0 and 1000(inclusive)

        // it's simple a * i ^ 3 + b * i ^ 2 + c * i + d equals 0 than the i will be integer root.

        for (int i = 0; i < 1001; i++) {

            if (a * (i * i * i) + b * (i * i) + c * i + d == 0) {

                System.out.println(i);
            }
        }


    }
}