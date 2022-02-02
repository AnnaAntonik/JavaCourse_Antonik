package work22;

public class Task22 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis()/1000;
        final int POINT = 60;
        long sec = time % POINT;
        time /= POINT;
        long min = time  % POINT;
        time /= POINT;
        long hour = (time +2) % 24;  //часовой пояс Украины GTM+2
        long day = time / 2;


        System.out.println(day + ":" + hour+  ":"+ min +":"+ sec);
    }
}
