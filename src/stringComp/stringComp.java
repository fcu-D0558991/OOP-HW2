package stringComp;
import java.util.Scanner;
public class stringComp{
		public  static void main(String[] args) {
			boolean c=false;
			do{
				Scanner input=new Scanner (System.in);
				System.out.println("Enter a string 1");
				String a=input.next();
				System.out.println("Enter a string 2");
				String b=input.next();
				c=a.equalsIgnoreCase(b);
				if(c==true)
					System.out.println("The two string are the same.");
				}
				while(c==false);
		
			}
}

