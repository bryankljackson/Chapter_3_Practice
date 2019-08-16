/*
 *(a) Write a Boolean expression that evaluates to true if a number stored in variable
 * num is between 1 and 100. 
 *
 *
 *(b) Write a Boolean expression that evaluates to true if
 * a number stored in variable num is between 1 and 100 or the number is negative.
 */

package demo;
import java.util.Scanner;

public class Practice3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please type in a number: ");
		int variable = input.nextInt();
		
		if (variable >= 1 && variable <= 100 || variable < 0) {
			boolean num = true;
			System.out.println(num);
			
		}
		
	}

}
