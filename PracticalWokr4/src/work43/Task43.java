package work43;

public class Task43 {
    public static void main(String[] args) {
        int digit = 1;
        while (digit <=8) {
            int value = digit;
            while (value >= 1) {
                System.out.print(value + " ");
                value--;
            }
            System.out.println();
            digit++;
        }
    }
}
