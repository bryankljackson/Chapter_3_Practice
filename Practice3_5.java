//Write an if statement that increases pay by 3% if score is greater than 90.

package demo;
import java.util.Scanner;

public class Practice3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		//Prompt the user
		
		System.out.println("Please input score: ");
		double score = input.nextDouble();
		
		if (score > 90) {
			System.out.println("Please input current pay: $");
			double originalPay = input.nextDouble();
			
			double newPay;
			newPay = originalPay * 1.03;
			System.out.println("Your original pay was " + 
					originalPay + " and your new pay is $" + newPay);
		}
		
		
	}
	

}
