package work75;

import java.util.Arrays;
import java.util.Scanner;

public class Task75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits 1-9: ");
        String numbers = sc.nextLine();
        int[] array = countOfSequenceNumbers(numbers);
        System.out.println(Arrays.toString(array));
    }

    public static int[] countOfSequenceNumbers(String numbers) {
        int[] array = new int[9];
        for (int i = 0; i< numbers.length(); i++) {
            int temp = Integer.valueOf(String.valueOf(numbers.charAt(i)));
            if (temp > 0) {
                array[temp-1]++;
            }
        }
        return array;

//        char[] value = text.toCharArray;
//        char[] digits = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
//        int[] count = new int[9];
//        for ( int i = 0; i<value.length; i++){
//            for (int j = 0; j<digits.length; j++) {
//                if (value[i] == digits[j]) {
//                    count[j]++;
//                }
//            }
//        }
//        return
    }
}
