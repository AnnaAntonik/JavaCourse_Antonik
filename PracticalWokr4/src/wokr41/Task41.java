package wokr41;

public class Task41 {
    public static void main(String[] args) {
        int value1 = 10;
        int value2 = 5;
        int value3 = 70;

        int maxValue = value1;

        if (maxValue < value2) {
            maxValue = value2;
        }
        if (maxValue < value3) {
            maxValue = value3;

        }
        System.out.println("Max = " + maxValue);
    }

}
