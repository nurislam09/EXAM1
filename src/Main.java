import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Напишите предложения");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int counter = 0;
        int finish;
        int d = sentence.length() - 1;
        boolean word = false;
        if (!(" ".equals(sentence.substring(0, 1))) &&
                !(" ".equals(sentence.substring(sentence.length() - 1)))) {
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ' ) {
                    counter++;
                }
            }
        }

        finish = counter + 1;
        System.out.println("количуство слов в предложении: " + finish);
    }
}






