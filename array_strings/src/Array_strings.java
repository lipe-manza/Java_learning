import java.util.Arrays;
import java.util.Scanner;

public class Array_strings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int size;

        System.out.print("What # of food do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine(); //clear the buffer

        foods = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter a food: ");
            foods[i] = scanner.nextLine();
        }
        for (String food : foods) {
            System.out.println(food);
        }

        scanner.close();
    }
}
