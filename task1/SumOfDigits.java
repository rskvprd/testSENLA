package task1;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string to count sum of digits in it");
        String string = in.nextLine();
        System.out.printf("Sum of digits is: %d", sumOfDigitsInString(string));
    }

    public static int sumOfDigitsInString(String str){
        int sum = 0;
        str = str.replaceAll("[^0-9]", "");

        for (int i = 0; i < str.length(); i++){
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        return sum;
    }
}
