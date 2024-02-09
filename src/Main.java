import com.bridgelabz.moodanalyzer.Moodanalyzer;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Moodanalyzer moodAnalyzer = new Moodanalyzer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Message: ");
        String message = scanner.nextLine();
        System.out.println(moodAnalyzer.analyzeMood(message));



    }
}