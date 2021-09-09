//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String firstName = sc.next();
        @SuppressWarnings("unused")
        int age = sc.nextInt();
        @SuppressWarnings("unused")
        String educationStage = sc.next();
        @SuppressWarnings("unused")
        int experience = sc.nextInt();
        String cuisinePref = sc.next();

        System.out.println("The form for " + firstName
                + " is completed. "
                + "We will contact you if we need " +
                "a chef that cooks " + cuisinePref
                + " dishes.");
    }
}