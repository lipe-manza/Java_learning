import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        int max;


        System.out.print("Enter the time of the Countdown:");
        max = scanner.nextInt();

        for (int i = max; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);

        }

        System.out.println("FINISH");

        scanner.close();

    }
}