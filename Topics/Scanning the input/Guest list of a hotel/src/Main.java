//put imports you need here

import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String singleRoom = sc.nextLine();


        String doubleRoom1 = sc.nextLine();
        String doubleRoom2 = sc.nextLine();
        String familyRoom = sc.nextLine();

        // let's create a seperated field and hold all input
        String input = singleRoom + " " + doubleRoom1 + " "
                + doubleRoom2 + " " + familyRoom;

        // let's split them by space and reverse
        String[] reversedString = new Main().returnStringReverseWithGivenSplitParam(input, " ");
        for (String s : reversedString) {

            if (!"".equals(s)) {
                System.out.println(s);
            }
        }



    }

    public String[] returnStringReverseWithGivenSplitParam(String input, String splitBy) {

        String[] split = input.split(splitBy);

        int dataLen = split.length;

        String[] result = new String[split.length];

        // let's traverse in array
        for (int i = 0; i < dataLen; i++) {


            result[i] = !Objects.equals(split[dataLen - i - 1], " ") ? split[dataLen - i - 1] : "";

        }

        return result;
    }
}