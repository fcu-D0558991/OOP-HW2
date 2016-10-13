package checkOddEven;
import java.util.Scanner;
public class CheckOddEven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a integer");
		int n1 = input.nextInt();
		if ((n1 % 2) == 0) {
			System.out.println("The input integer is Even Number");
		} else {
			System.out.println("The input integer is Odd Number");
		}
	}
}
