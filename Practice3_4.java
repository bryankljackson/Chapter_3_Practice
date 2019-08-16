//Write an if statement that assigns 1 to x if y is greater than 0


package demo;
import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoke Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt to input y
		System.out.println("Please input y: ");
		
		int number = input.nextInt();
		
		
		if (number > 0) {
			int numberX = 1;
			System.out.print("x = " + numberX);
		
		}
		
		
		
		
		
		
	}

}
