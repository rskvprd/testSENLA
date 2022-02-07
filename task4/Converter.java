package task4;

import java.util.Scanner;

public class Converter {
    private static final String[][] BEAUTIFUL_DIGITS = {
            {
                    "****",
                    "*  *",
                    "*  *",
                    "*  *",
                    "****"
            },
            {
                    "   *",
                    "   *",
                    "   *",
                    "   *",
                    "   *"
            },
            {
                    "****",
                    "   *",
                    "****",
                    "*   ",
                    "****"
            },
            {
                    "****",
                    "   *",
                    "****",
                    "   *",
                    "****"
            },
            {
                    "*  *",
                    "*  *",
                    "****",
                    "   *",
                    "   *"
            },
            {
                    "****",
                    "*   ",
                    "****",
                    "   *",
                    "****"
            },
            {
                    "****",
                    "*   ",
                    "****",
                    "*  *",
                    "****"
            },
            {
                    "****",
                    "   *",
                    "  * ",
                    "  * ",
                    "  * "
            },
            {
                    "****",
                    "*  *",
                    "****",
                    "*  *",
                    "****"
            },
            {
                    "****",
                    "*  *",
                    "****",
                    "   *",
                    "****"
            }
    };

    public static void printNumstr(String[][] numstr){
        for (int i = 0; i < 5; i++) {
            for (String[] dig: numstr){
                System.out.print(dig[i] + " ");
            }
            System.out.println();
        }
    }

    static String[][] toNumstr(int number){
        String numberStr = Integer.toString(number);
        String[][] numstr = new String[numberStr.length()][5];
        int index = 0, digit, max = 0;
        for (int i = 0; i < numberStr.length(); i++) {
            digit = numberStr.charAt(i) - '0';
            if (digit > max){
                max = digit;
                index = i;
            }
            numstr[i] = BEAUTIFUL_DIGITS[digit];
        }
        for (int i = 0; i < numstr[index].length; i++){
            numstr[index][i] = numstr[index][i].replaceAll("\\*", Integer.toString(max));
        }

        return numstr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number:");
        int userInput = scanner.nextInt();
        printNumstr(toNumstr(userInput));
    }
}
