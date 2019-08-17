/*
 * The Chinese Zodiac is based on a twelve-year cycle, 
 * with each year represented by an animal— monkey, rooster,
 * dog, pig, rat, ox, tiger, rabbit, dragon, snake, horse, or sheep.
 * 
 * Write a program that prompts the user to enter a year and displays
 * the animal for the year.
 */


package demo;
import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		//Prompt
		System.out.println("Input the year: ");
		int year = input.nextInt();
		
		switch (year % 12) {
		case 0: System.out.print("monkey");
								break;
		case 1: System.out.print("rooster");
								break;
		case 2: System.out.print("dog");
								break;
		case 3: System.out.print("pig");
								break;
		case 4: System.out.print("rat");
								break;
		case 5: System.out.print("ox");
								break;
		case 6: System.out.print("tiger");
								break;
		case 7: System.out.print("rabbit");
								break;
		case 8: System.out.print("dragon");
								break;
		case 9: System.out.print("snake");
								break;
		case 10: System.out.print("horse");
								break;
		case 11: System.out.print("sheep");
								break;
		
		}
		
	}

}
