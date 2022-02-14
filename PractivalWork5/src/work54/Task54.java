package work54;

public class Task54 {
    public static void main(String[] args) {
        String word1 = "Cartoon";
        String word2 = "Tomcat";

        int index = 0;
        while (index < word1.length()) {//вычислили количество индексов пер слова
            char symbol = word1.charAt(index);
            if (word2.indexOf(symbol) == -1) {
//            if (word2.contains(String.valueOf(symbol))) {
                System.out.print(symbol + " ");
            }
            index++;

        }
    }
}
