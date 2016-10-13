package stringComparator;
import java.util.Scanner;
public class StringComparator {
	public  static void main(String [] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("Enter a string 1");
		String a=input.next();
		System.out.println("Enter a string 2");
		String b=input.next();
		boolean c;
		
	    c=a.equalsIgnoreCase(b);
	    if(c==true){
	    	System.out.println("The two string are the same.");
	    }
	    else{
	    	System.out.println("The two string are different");
	    }
	}	
}
