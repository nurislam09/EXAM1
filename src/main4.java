import java.util.Arrays;
import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        System.out.println("напишите предложения");
    Scanner scanner = new Scanner(System.in);
    String sentence = scanner.nextLine();
    int counter = 0;
    String[] counter2 = sentence.split(" ");
        System.out.println(Arrays.toString(counter2));
        for (String s : counter2) {
        if (!s.isEmpty()) {
            counter++;
        }
    }
        System.out.println(counter);
}
}



