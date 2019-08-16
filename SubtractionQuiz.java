/*
 * 1. Generate two single-digit integers into number1 and number2.
 * 2. If number1 < number2, swap number1 with number2.
 * 3. Prompt the student to answer, "What is number1 – number2?"
 * 4. Check the student’s answer and display whether the answer is correct
 */

package demo;
import java.util.Scanner;

public class SubtractionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		if (number1 < number2) {
			int answer = number2 - number1;
			System.out.println("What is  " + number2 + 
					" - " + number1);
			int userAnswer = input.nextInt();
			
			if (userAnswer == answer) {
				System.out.println("The answer is correct.");
				
			}
				else if (userAnswer != answer) {
					System.out.println("The answer is false.");
				}
			
		}
			else {
				int answer = number1 - number2;
				System.out.println("What is  " + number1 + 
						" - " + number2);
				int userAnswer = input.nextInt();
				
				if (userAnswer == answer) {
					System.out.println("The answer is correct.");
					
				}
					else if (userAnswer != answer) {
						System.out.println("The answer is false.");
					}
				
			}
		
		
		
	}

}
