package work52;

public class Task52 {
    public static void main(String[] args) {
        String name = "National Aviation University";
//        String abr = "" + name.charAt(0); получили число и приобразовали в текст
        String abr = String.valueOf(name.charAt(0));
        abr = abr + name.charAt( name.indexOf(" ") + 1 );
        abr = abr + name.charAt( name.lastIndexOf(" ") + 1 );

        System.out.println(abr);
    }
}
