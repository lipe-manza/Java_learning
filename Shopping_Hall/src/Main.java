import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;


        System.out.print("With item do you wanna buy? ");
        item = scanner.nextLine().trim();
        System.out.print("what is the price of each" + " " + item + "?");
        price = scanner.nextDouble();
        System.out.print("How many" + item + "/s?");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("The total price is:" + " " + total + currency);

        scanner.close();

    }
}