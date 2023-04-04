import java.util.Random;
import java.util.Scanner;

class number {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
         Random random = new Random();
         int numberToGuess = random.nextInt(101);
         int numberOfGuesses = 0;
		int score=10;

        int guess;

        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

        do {
		System.out.print("Enter your guess: ");
		guess = scanner.nextInt();
		numberOfGuesses++;
		if(numberOfGuesses<=9){
            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
				score -=1;
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
				score -=1;
            }
		}
		else{
			System.out.println("chances are completed");
			System.exit(0);
		}
        } while (guess != numberToGuess);

		System.out.println("Congratulations! You guessed the number in " + numberOfGuesses + " guesses.");
		System.out.println("Your score is "+score+"/10");
    }
}
