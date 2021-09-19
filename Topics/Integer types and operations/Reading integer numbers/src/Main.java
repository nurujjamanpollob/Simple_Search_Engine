import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> dataList = new ArrayList<>();
        StringBuilder tmp = new StringBuilder();
        String input = scanner.nextLine();

        for (char c : input.toCharArray()) {

            try {

                tmp.append(Integer.parseInt(String.valueOf(c)));

            } catch (Exception ess) {

                if (tmp.length() > 0) {

                    dataList.add(Integer.parseInt(tmp.toString()));
                }


                tmp = new StringBuilder();

            }

        }

        if (tmp.length() > 0) {

            dataList.add(Integer.parseInt(tmp.toString()));
        }

        for (Integer i : dataList) {

            System.out.println(i);
        }


    }
}