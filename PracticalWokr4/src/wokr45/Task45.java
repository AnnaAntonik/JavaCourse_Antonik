package wokr45;

public class Task45 {
    public static void main(String[] args) {
        System.out.println("* | 1  2  3  4  5  6  7  8  9");
        System.out.println("_________________________________");
        int a = 0;
        while (a++ < 10) {
            System.out.print(a + " | ");
            int b = 0;
            while (b++ < 10) {
                System.out.print (" " + a * b);
            }
            System.out.println();
        }
    }
}