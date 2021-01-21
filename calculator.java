package calc;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {

		ShowResults();

	}

	public static void ShowResults() {

		String password = "Poo123";

		Scanner stdin = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = stdin.nextLine();
		System.out.println("Please enter your password: ");
		String pass = stdin.nextLine();

		

		if (pass.equals(password)) {
			
			System.out.println("Please enter your results");
			System.out.println("Enter your results for physics please : ");
			int phys = stdin.nextInt();
			
			System.out.println("Enter your results for Chemistry please : ");
			int chem = stdin.nextInt();
			
			System.out.println("Enter your results for Biology please : ");
			int bio = stdin.nextInt();
			int total = bio + chem + phys;

			System.out.println("Here are you're results For triple science");
			System.out.println("You scored as follows; " + phys + " in physics. " + bio + " in Biology. " + chem
					+ " in Chemistry.");
			System.out.println("Well done! This is a grand total of: " + total);
			if (total < 100) {
				System.out.println("You really need to try harder");
			} else if (total > 100) {
				System.out.println("Really well done on the test!");
			} else {

			}

		} else {
			System.out.println("Password incorrect, restart the program to try again. ");
		}

	}

}
