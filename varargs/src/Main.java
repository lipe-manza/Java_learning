public class Main {
    public static void main(String[] args) {
        /*
         varargs = allow a method to accept a varying # of arguments
                   makes methods more flexible , no need for overloaded methods
                   java will pack the arguments into an array
                   ... (ellipsis)
        */

        System.out.printf("%.2f", average(1, 3, 4, 6, 8, 10));
    }

    static double average(double... numbers) {
        double sum = 0;

        for (double number : numbers) {
            sum += (int) number;
        }

        return sum / numbers.length;

    }


}