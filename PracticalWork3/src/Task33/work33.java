package Task33;

public class work33 {
    public static void main(String[] args) {
        double startPrice = 830;
        double discVal = 13;
        double incrVal = 7;
        double newPrice = startPrice - (startPrice * discVal / 100);
        double lastPrice = newPrice + (newPrice * incrVal / 100);

        System.out.println(lastPrice);
    }
}
