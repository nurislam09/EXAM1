import java.util.Scanner;

public class main2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(method());
    }

    public static int method() {
        String word = scanner.nextLine();
        int counter = 0;
        boolean sentence = false;
        int end = word.length() - 1;
        for (int i = 0; i < word.length(); i++) {

            if (Character.isLetter(word.charAt(i)) && i != end) {
                sentence = true;
            } else if (!Character.isLetter(word.charAt(i)) && sentence) {
                counter++;
                sentence = false;
            } else if (Character.isLetter(word.charAt(i)) && i == end) {
                counter++;
            }
        }

        return counter;


    }
}
