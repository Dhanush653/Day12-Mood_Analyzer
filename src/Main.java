import com.bridgelabz.moodanalyzer.Moodanalyzer;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your Message: ");
//        String message = scanner.nextLine();
        String message = null;

        //Refactored
        Moodanalyzer moodAnalyzer = new Moodanalyzer(message);
        moodAnalyzer.analyzeMood();
    }
}