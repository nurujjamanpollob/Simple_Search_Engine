import java.util.Scanner;

class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int lenOfRect = sc.nextInt();
        int widthOfReact = sc.nextInt();
        int segment = sc.nextInt();

        System.out.println(resultMake(lenOfRect, widthOfReact, segment));


    }

    private static String resultMake(int len, int width, int segment) {


        // run approach one
        int tmp = 0;

        for (int i = 0; i < len; i++) {

            if (tmp == segment) {

                return "YES";
            }

            tmp += width;


        }

        // reset tmp
        tmp = 0;
        // approach two
        for (int i = 0; i < width; i++) {

            if (tmp == segment) {

                return "YES";
            }

            tmp += len;


        }


        return "NO";
    }


}