package work72;

import java.util.Arrays;
import java.util.Scanner;

public class work72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massive size: ");
        int size = sc.nextInt();
        int [] myArray = CreateArray(size);
        System.out.println(Arrays.toString(myArray));
    }

    public static int [] CreateArray(int size) {
        if (size <= 0) {
            return  new int[0];
        }
        int[] arrayNumbers = new int[size];
        int number = 2;
        for(int i = 1; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = number;
            number += 2;
        }
        return arrayNumbers;

    }
}
