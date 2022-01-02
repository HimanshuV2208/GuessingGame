package androidDev;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Game!");
		System.out.println("Please enter your name: ");
		String name = sc.nextLine();
		System.out.println("Hello " + name + "!");
		System.out.println("Press 1 to begin the game: ");
		int choice = sc.nextInt();
		boolean start = choice == 1 ? true : false;

		int answer = random.nextInt(20) + 1;
		int guessNo = 1, guessedNo = 0;

		while (start && guessNo<=5) {

			System.out.println("Enter your guess: ");
			guessedNo = sc.nextInt();

			if (guessedNo == answer) {
				System.out.println("Congratulations " + name + "! You guessed correctly.");
				return;
			}

			if (guessNo!=5) {
				if (guessedNo > answer)
					System.out.println("Wrong Guess! Guess a smaller number.");
				else
					System.out.println("Wrong Guess! Guess a larger number.");
			}

			guessNo++;

		}
		
		System.out.println("Game Over! The number was " + answer);
		return;

	}

}
