import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int points = 0;
        int totalRounds = 0;
        String playAgain;

        do {
            int min = 1;
            int max = 100;
            int number = random.nextInt(max - min + 1) + min;
            int turns = 5;

            System.out.println("Guess a number between 1 and 100.");

            for (int j = 0; j < turns; j++) {
                System.out.print("Turn" + (j + 1) + ": ");
                int userNumber = scanner.nextInt();

                if (userNumber < number) {
                    System.out.println("The number is too low!");
                } else if (userNumber > number) {
                    System.out.println("The number is too high!");
                } else {
                    System.out.println("You Won!");
                    points++;
                    break;
                }
            }

            totalRounds++;
            System.out.println("Your score: " + points + " out of " + totalRounds);
            System.out.println();

            System.out.print("Do you want to play another round? (yes/no): ");
            playAgain = scanner.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Your final score: " + points + " out of " + totalRounds);
        System.out.println("Thanks for playing!");

        scanner.close();
    }
}
