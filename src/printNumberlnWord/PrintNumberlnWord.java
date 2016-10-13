package printNumberlnWord;
import java.util.Scanner;
public class PrintNumberlnWord {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a integer");
		int a=input.nextInt();
		switch(a){
		case 1:
			System.out.println("The input intrger is \"ONE\"");
			break;
		case 2:
			System.out.println("The input intrger is \"TWO\"");
			break;
		case 3:
			System.out.println("The input intrger is \"THREE\"");
			break;
		case 4:
			System.out.println("The input intrger is \"FOUR\"");
			break;
		case 5:
			System.out.println("The input intrger is \"FIVE\"");
			break;
		case 6:
			System.out.println("The input intrger is \"SIX\"");
			break;
		case 7:
			System.out.println("The input intrger is \"SEVEN\"");
			break;
		case 8:
			System.out.println("The input intrger is \"EIGHT\"");
			break;
		case 9:
			System.out.println("The input intrger is \"NINE\"");
			break;
		case 10:
			System.out.println("The input intrger is \"TEN\"");
			break;
		default:
			System.out.println("The input intrger is \"OTHER\"");
		}
	}

}
