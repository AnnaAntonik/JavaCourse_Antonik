package Classwokr1;

import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter weight -> ");
        double weight = scanner.nextDouble();

        final double VALUE = 453.6;

        double total = weight * VALUE;// в граммах
        int kilo = (int) (total / 1000);//обрезалли все, что после точки/ остались кг
        int gram = (int) (total - kilo * 1000);

        System.out.println("kg = " + kilo + "; gr = " + gram);


    }
}//в задании 3/2 задать сумму, количество месяцев, дальше расчитывайть и вывести, создать один сканер? через который можно читать два значения
// в задании 3/3 