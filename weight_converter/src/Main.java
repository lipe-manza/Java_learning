import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        System.out.printf("Please put the weight in %s to transform into %s: ", (choice == 1 ? "lbs" : "kgs"), (choice == 1 ? "lbs" : "kgs"));
        weight = scanner.nextDouble();

        switch (choice) {
            case 1:
                newWeight = weight * 0.453592;
                System.out.printf("The new weight in kgs is: %.2f", newWeight);
                break;
            case 2:
                newWeight = weight *2.20462;
                System.out.printf("The new weight in lbs is: %.2f", newWeight);
                break;
            default:
                System.out.println("Invalid option");
                break;

        }

        scanner.close();

    }
}