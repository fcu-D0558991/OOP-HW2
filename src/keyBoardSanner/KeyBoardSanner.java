package keyBoardSanner;

import java.util.Scanner;

public class KeyBoardSanner {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a integer");
		int a = input.nextInt();
		System.out.print("Enter a float point number");
		float b = input.nextFloat();
		System.out.print("Enter a you name");
		String c = input.next();
		float d = a * b;
		System.out.print("Hi" + c + ",the muplication of" + a + "and" + b
				+ "is");
		System.out.printf("%4.2e", d);
	}
	
}
