package work64;

import java.util.Scanner;

public class Task64 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int number = sc.nextInt();
        System.out.println(convertDecimalToBinary(number));
    }

    public static String convertDecimalToBinary(int  number) {
        if (number <= 0 ) {
            return "Error! The integer is not positive";
        }
        String binary = "";
        while (number > 0) {
            if (number % 2 == 0) {
                binary = "0" + binary;
            } else {
                binary = "1" + binary;
            }
            number /= 2;
        }
        return binary;
    }
}
