package work24;

public class Task24 {
    public static void main(String[] args) {
        int number = 845;
        int num = number;
        int hundr = (num % 10) * 100;
        num /= 10;
        int doz = (num % 10) * 10;
        num /= 10;
        int reverse = hundr + doz + num;

        System.out.println(number + "-" + reverse + "=" + (number - reverse));


    }
}
