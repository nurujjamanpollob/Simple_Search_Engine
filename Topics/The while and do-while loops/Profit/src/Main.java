import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double m = sc.nextDouble();
        double p = sc.nextDouble();
        double k = sc.nextDouble();

        int result = 0;

        for (double i = m; i < k; i++) {

            if (m < k) {

                m = m + (m / 100) * p;

                result++;
            } else {

                break;
            }


        }


        System.out.println(result);


    }


}