
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
        int i = 1; // Criamos um contador manual começando em 1
        for (String food : foods) {
            // %d para o número, %s para o texto, %n para pular linha
            System.out.printf("Comida #%d: %s%n", i, food);

            i++; // Aumentamos o contador manualmente a cada volta
        }

        scanner.close();
    }
}
