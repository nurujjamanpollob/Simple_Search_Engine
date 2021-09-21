import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String yes = "YES";
        String no = "NO";

        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int p3 = sc.nextInt();

        String result = "NO";

        if (p1 + p2 > p3) {

            result = yes;
        }

        if (p1 + p3 > p2) {

            result = yes;
        }

        if (p2 + p3 > p1) {

            result = yes;
        }


        if (p1 + p2 <= p3) {

            result = no;
        }

        if (p1 + p3 <= p2) {

            result = no;
        }

        if (p2 + p3 <= p1) {

            result = no;
        }


        System.out.println(result);


    }
}