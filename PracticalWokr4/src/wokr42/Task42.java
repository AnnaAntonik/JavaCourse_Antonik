package wokr42;

import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number: ");
        int number = scanner.nextInt();

//        if (number == 1) {
//            System.out.println("One");
//        } else if (number == 2) {
//            System.out.println("Two");
//        } else {
//            System.out.println("Other");
//        }

        switch (number) {
            case 1:
                System.out.println("One"); break;
            case 2:
                System.out.println("Two"); break;
            case 3:
                System.out.println("Three"); break;
            case 4:
                System.out.println("Four"); break;
            case 5:
                System.out.println("Five"); break;
            case 6:
                System.out.println("Six"); break;
            case 7:
                System.out.println("Seven"); break;
            case 8:
                System.out.println("Eight"); break;
            case 9:
                System.out.println("Nine"); break;
            default:
                System.out.println("Other");
        }
    }
}
