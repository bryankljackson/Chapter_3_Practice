/*
 * The program randomly generates a lottery of a two-digit number, 
 * prompts the user to enter a two-digit number, and determines
 * whether the user wins according to the following rules:
 * 
 * 1. If the user input matches the lottery number in the exact
 * order, the award is $10,000.
 * 
 * 2. If all digits in the user input match all digits in the 
 * lottery number, the award is $3,000.
 * 
 * 3. If one digit in the user input matches a digit in the lottery
 *  number, the award is $1,000.
 * 
 */

package demo;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int randomNumber = (int)(Math.random() * 100);
		
		randomNumber = 23;
		System.out.println(randomNumber);
		
		System.out.println("Type in a 2 digit number: ");
		int guess = input.nextInt();
		
		int lotteryNumber1 = randomNumber / 10;
		int lotteryNumber2 = randomNumber % 10;
		int guessNumber1 = guess / 10;
		int guessNumber2 = guess % 10;
		
		if (guess == randomNumber) {
			System.out.println("You have won $10,000.");
		}
	
		
		else if (guessNumber2 == lotteryNumber1 && guessNumber1 == lotteryNumber2) {
			System.out.println("You have won $3000.");
		}
		
		else if ((guessNumber1 == lotteryNumber1 || guessNumber1 == lotteryNumber2) 
				|| (guessNumber2 == lotteryNumber1 || guessNumber2 == lotteryNumber2)) {
			System.out.println("You have won $1000");
		}
		
			
		
		
			
		
		System.out.println(guessNumber1 + " " + guessNumber2 + " " + lotteryNumber1 + " " + lotteryNumber2);
		
		
		
	}

}
