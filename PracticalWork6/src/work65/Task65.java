package work65;

import java.util.Scanner;

public class Task65 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Height: ");
        int height = scan.nextInt ();
        printPyramid (height);
    }
    public static void printPyramid( int height) {
        if (height <= 0 || height > 9) {
            System.out.println("Invalid height of pyramid");
            return;
        }
        int level = 1, digit;
        String space = "         ";
        while (level <= height) {
            digit = 1;
            String spaceCurrentLevel = space.substring(0, height-level);
            String setDigitDown = "";
            String setDigitsUp = "";

            while (digit < level) {
                setDigitsUp = setDigitsUp + digit;
                setDigitDown = digit + setDigitDown;
                digit++;
            }
            System.out.println(spaceCurrentLevel + setDigitsUp + level + setDigitDown);
            level++;
        }
    }
}
