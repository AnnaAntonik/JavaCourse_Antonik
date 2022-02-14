package wokr53;

public class Task53 {
    public static void main(String[] args) {
        String text = "An  information  system  is  designed  to  collect,  " +
                "process, store and distribute information";
        String first = text.substring(0, text.indexOf(" "));
        String middle = text.substring((text.indexOf(" ") + 1), (text.lastIndexOf(" ") + 1) );
        String last = text.substring((text.lastIndexOf(" ") + 1), text.length () );
        String newText = last.concat(middle).concat(first);

        System.out.println(newText);











    }
}
