import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            System.out.print("Enter your choice (rock , paper , scissors): ");
            playerChoice = scanner.nextLine().toLowerCase().trim();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice");
                playerChoice = scanner.nextLine().toLowerCase().trim();
                continue;
            }


            computerChoice = choices[random.nextInt(0, 3)];
            System.out.printf("computer choice: %s\n", computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("its a tie!");
            } else if (
                    (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                            (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                            (playerChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
            System.out.println("If you want wo play again type \"yes\":");
            playAgain = scanner.nextLine();

        }while (playAgain.equals("yes"));


        System.out.println("**********");
        System.out.println("Thanks for playing!");
        System.out.println("**********");

        scanner.close();
    }
}
