package wokr44;

public class Task44 {
    public static void main(String[] args) {
        int a = 0;
        int res = 0;
        while (a++ <= 300) {
            if (a % 3 == 0 || a % 4 == 0) {
                System.out.print(a + " ");
//                System.out.println(res);
                res++;
            } else if (res > 10) {
                break;
            }
        }
    }
}