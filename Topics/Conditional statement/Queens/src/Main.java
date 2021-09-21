import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String result = "";

        int q1x = sc.nextInt();
        int q1y = sc.nextInt();
        int q2x = sc.nextInt();
        int q2y = sc.nextInt();

        String yes = "YES";
        if (q1x == q2x) {

            result = yes;
        }

        if (q2y == q1y) {

            result = yes;

        }

        if (!result.equals(yes)) {
            boolean flg = Math.abs(q1x - q2x) == Math.abs(q1y - q2y);

            if (flg) {

                result = yes;
            } else {

                result = "NO";
            }

        }


        System.out.println(result);


    }
}