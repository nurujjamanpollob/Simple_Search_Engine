import java.util.Scanner;

class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int last = sc.nextInt();

        // lets run loop by given index param

        for (int i = first; i <= last; i++) {

            boolean out = true;


            if (i % 3 == 0 && i % 5 == 0) {

                System.out.println("FizzBuzz");

                out = false;
            }


            // Second case: number can be divided by 3?

            if (i % 3 == 0 && i % 5 != 0) {

                System.out.println("Fizz");
                out = false;
            }


            // Third case: number can be divided by 5?

            if (i % 5 == 0 && i % 3 != 0) {

                System.out.println("Buzz");

                out = false;

            }


            // no case matched so lets simply print this number


            if (out) {

                System.out.println(i);
            }

        }
    }
}