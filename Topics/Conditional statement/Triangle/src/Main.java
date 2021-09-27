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


        boolean b1 = false;
        boolean b2 = true;
        boolean b3 = false;

        boolean resultl = (b1 && b2) ? b1 : (b2 || b3) ? b2 : b3;

        System.out.println(resultl);




    }
}