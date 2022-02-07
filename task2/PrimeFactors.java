package task2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        try {
            System.out.println("Enter integer number");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if (input <= 0)
                System.out.println(input + " is not natural number.");
            else
                System.out.println(getPrimeFactors(input));
        } catch (InputMismatchException er){
            System.out.println("Wrong input.");
        }
    }

    public static ArrayList<Integer> getPrimeFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        int factor = 2;
        while (number != 1){
            while (number % factor == 0){
                factors.add(factor);
                number /= factor;
            }
            factor += 2;
        }
        return factors;
    }

}
