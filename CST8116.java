import java.util.Scanner;

public class CST8116 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int secretNumber = 7;
        int attempts = 0;
        int guess = 0;

        while (attempts < 3) {

            System.out.print("Enter a number between 1 and 10: ");

            if (scanner.hasNextInt()) {

                guess = scanner.nextInt();
                attempts = attempts + 1;

                if (guess < secretNumber) {
                    System.out.println("Too low!");

                } else if (guess > secretNumber) {
                    System.out.println("Too high!");

                } else {
                    System.out.println("Correct! You guessed the number!");
                    break;
                }

            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
        	if (attempts == 3 && guess != secretNumber) {
        		System.out.println("Game over! You've used all 3 attempts.");
        }
    }
}
	
