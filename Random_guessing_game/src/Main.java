import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //RANDOM GUESSING GAME


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.print("NUMBER GUESSING GAME");
        System.out.printf("Choose a number between %d-%d\n ", min, max);

        
        do {
            System.out.print("Enter a guess:");
            guess = scanner.nextInt();
            attempts++;
            if (guess < randomNumber) {
                System.out.println("Too low");
            } else if (guess > randomNumber) {
                System.out.println("Too high");
            } else {
                System.out.printf("You have won the number was: %d\n", randomNumber);
                System.out.println("The amount of guesses was :" + " " + attempts);
            }

        } while (guess != randomNumber);


        scanner.close();
    }

}