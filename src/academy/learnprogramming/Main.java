package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanValue = new Scanner(System.in);

        int counter = 0;
        int number;
        boolean hasNextInt;
        int sum = 0;

        while (counter < 10) {
            counter++;
            System.out.print("Enter number #" + counter + ": ");

            hasNextInt = scanValue.hasNextInt();

            if (hasNextInt) {
                number = scanValue.nextInt();
                scanValue.nextLine();
                sum += number;
            } else {
                System.out.println("Invalid number");
                scanValue.nextLine();
            }
        }
        System.out.println("Total = " + sum);
        scanValue.close();
    }
}
