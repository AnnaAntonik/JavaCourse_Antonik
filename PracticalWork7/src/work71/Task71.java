package work71;

import java.util.Arrays;

public class Task71 {
    public static void main(String[] args) {
        int[] arr = createArray(5);
        System.out.println(Arrays.toString(arr));
        System.out.println("Sum = " + sumOddElementsArray(arr) );

    }
    public static int[] createArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =  (int) (Math.random() * 100);
        }
        return arr;
    }

    public static int sumOddElementsArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int element : array) {
            if (element % 2 ==1) {
                sum +=element;
            }
        }
        return  sum;
    }
}
