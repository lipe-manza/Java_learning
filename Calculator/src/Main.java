

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        char operator;
        double result = 0;
        Boolean validOperator = true;

        System.out.println("Enter the operation using +, - , * , / , ^: ");
        a = scanner.nextInt();
        operator = scanner.next().charAt(0);
        b = scanner.nextInt();

        switch (operator) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> {
                if (b == 0) {
                    System.out.println("You can not divide by 0");
                } else {
                    result = (a / b);
                }
            }
            case '^' -> result = Math.pow(a, b);
            default -> validOperator = false;
        }
        if (validOperator && b != 0) {
            System.out.printf("The result of %.2f %c %.2f = % ,.2f", a, operator, b, result);
        }
        scanner.close();

    }


}