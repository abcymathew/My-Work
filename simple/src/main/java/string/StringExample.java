
package string;
import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String revString="";
		int length=s.length();
		for(int i=length-1;i>=0;i--)
		{
			revString=revString+s.charAt(i);
		
				
		}
		if(revString.equals(s))
		{
			System.out.println("it is plandrome");
			
		}
		else
			System.out.println("it is not plandrome");

	}

}
