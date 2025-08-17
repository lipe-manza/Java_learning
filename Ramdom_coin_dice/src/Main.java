import java.util.Random;


public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        //Group 1: dice
        int number1;
        int number2;
        int number3;

        number1 = random.nextInt(6);
        number2 = random.nextInt(6);
        number3 = random.nextInt(6);


        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        //Group 2: coin

        boolean isHeads;

        isHeads = random.nextBoolean();

        System.out.println("Its heads:" + isHeads);


    }
}