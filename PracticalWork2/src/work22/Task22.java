package work22;

public class Task22 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis()/1000;
        long sec = (time % 60);
        long min = ((time/60) %60);
        long hour = ((time/3600) %24 + 2);  //часовой пояс Украины GTM+2
        long day = ((time/(3600 * 24)));


        System.out.println(day + ":" + hour+  ":"+ min +":"+ sec);
    }
}
