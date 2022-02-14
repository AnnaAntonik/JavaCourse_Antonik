package wokr46;

import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число: ");
        int number = scanner.nextInt();
        int result = 0;

        while (number > 0) {
            int digit = number % 10;
            result += digit * digit;
            number /= 10;
        }
        System.out.println(result);
    }
}
