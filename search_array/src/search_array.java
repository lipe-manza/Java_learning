import java.util.Scanner;

public class search_array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        int target;
        boolean isFound = false;

        System.out.println("Enter a target");
        target = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Element was not found in the array");
        }

        scanner.close();

    }
}
