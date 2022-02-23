package work61;

public class Task61 {
    public static void main(String[] args) {
        double area = areaTriangle(3.0, 4, 5.0);
        System.out.printf("Area = %.2f\n", area);
//        System.out.printf("Area = %.2f\n", areaTriangle (a = 3.0, b = 4, c = 5.0));
    }

    public static double areaTriangle(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }
}
