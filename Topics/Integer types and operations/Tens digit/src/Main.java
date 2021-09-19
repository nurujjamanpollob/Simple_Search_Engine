import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        String cInput = String.valueOf(input);

        if (cInput.length() > 1) {

            System.out.println(Integer.parseInt(String.valueOf(cInput.charAt(cInput.length() - 2))));

        } else {

            System.out.println(0);
        }
    }
}