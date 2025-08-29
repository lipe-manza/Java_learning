import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] questions = {
                "What is the main function of a router?",
                "Which part of the computer is considered the brain?",
                "What year was Facebook launched?",
                "Who is known as the father of computer?",
                "What was the first programming language?"};

        String[][] options = {
                {"1. To connect computers within a LAN", "2. To route data between networks", "3. To store data permanently", "4. To process instructions"},
                {"1. Hard Drive", "2. CPU", "3. RAM", "4. Motherboard"},
                {"1. 2002", "2. 2008", "3. 2012", "4. 2004"},
                {"1. Charles Babbage", "2. John von Neumann ", "3. Alan Turing", "4. Ada Lovelace"},
                {"1. Cobol", "2. Fortran", "3. Java", "4. Assembly"}};

        int[] answers = {2, 2, 4, 3, 2};
        int guess, count = 0, total = answers.length;


        System.out.println("********************************");
        System.out.println("Welcome to the Java Quiz Game!!!");
        System.out.println("********************************");


        for (int r = 0; r < questions.length; r++) {
            System.out.println(questions[r]);
            for (String option : options[r]) {
                System.out.println(option);

            }
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
                if (guess == answers[r]) {
                    System.out.println("**********");
                    System.out.println(" CORRECT!");
                    System.out.println("**********");
                    count++;
                }
                else {
                    System.out.println("********");
                    System.out.println(" Wrong!");
                    System.out.println("********");
            }
        }

        System.out.printf("You answered:\n  %d correct(s); \n  %d incorrect(s);\nout of: %d", count , total-count, total);








    }
}
