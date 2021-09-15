import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        // store base
        int baseCount = 10;
        //store result
        int result = 0;

        while (baseCount <= input) {
            // increase count by one
            result += 1;
            // increase base by 10 needed for finish calculation
            baseCount += 10;
        }

        System.out.println(result);

    }
}