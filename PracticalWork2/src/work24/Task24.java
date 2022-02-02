package work24;

public class Task24 {
    public static void main(String[] args) {
        int number = 845;
        int num = number;
        int a = (number % 10) * 100;
        number /= 10;
        int b = (number % 10) * 10;
        number /= 10;
        int reverse = a + b + number;

        System.out.println(num + "-" + reverse + "=" + (num - reverse));


    }
}
