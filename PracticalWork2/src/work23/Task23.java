package work23;

public class Task23 {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        System.out.println("До перестановки: a = " + a + ", b = " + b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("После перестановки: a = " + a + ", b = " + b);

    }
}
