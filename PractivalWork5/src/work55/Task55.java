package work55;

import java.util.Scanner;

public class Task55 {
    public static void main(String[] args) {
        System.out.println("Enter your text:");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        int a = 0;
        while (a < text.length()) {
            char letter = text.charAt(a);
            if (text.indexOf(letter) == text.lastIndexOf(letter)) {
                System.out.print(letter + " ");
            }
            a++;
        }
    }
}
