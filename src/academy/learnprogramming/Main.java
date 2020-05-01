package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanValue = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        int number;
        boolean hasNextInt;

//        while (counter < 10) {
//            counter++;
//            System.out.print("Enter number #" + counter + ": ");
//
//            hasNextInt = scanValue.hasNextInt();
//
//            if (hasNextInt) {
//                number = scanValue.nextInt();
//                sum += number;
//            } else {
//                System.out.println("Invalid number");
//            }
//            scanValue.nextLine();
//        }

        // Another version of while --> using infinite loop
        // and break when condition reached

        while (true) {
            int order = counter + 1;
            System.out.print("Enter number #" + order + ": ");

            boolean hasIntValue = scanValue.hasNextInt();

            if (hasIntValue) {
                number = scanValue.nextInt();
                counter++;
                sum += number;
                if (counter == 10){
                    break;
                }
            } else {
                System.out.println("Invalid Value");
            }
            scanValue.nextLine();
        }

        System.out.println("Total = " + sum);
        scanValue.close();
    }
}
