package Task32;

import java.util.Scanner;

public class work32 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Введите сумму вклада и количество месяцев для расчета: ");
        double sum = scanner.nextDouble();
        double month = scanner.nextDouble ();
        double rate = 12;
        final double YEAR = 12;
        double profit = ((sum * rate * (month / YEAR)) / 100);

        System.out.println("Сумма вклада: " + sum+ " грн, Количество месяцев: " + month);
        System.out.println("Сумма дохода по депозиту = " + profit + " грн");

    }
}
