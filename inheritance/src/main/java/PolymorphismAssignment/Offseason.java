package PolymorphismAssignment;
import java.util.Scanner;
public class Offseason {
	double d;
	double c;
	double costToPaid;
	
	
public void discount()
{
	System.out.println("current bill for offseason");
	Scanner sc=new Scanner(System.in);
	 c=sc.nextDouble();
	d=c*0.15;
	System.out.println("discount for offseason"+d);
	costToPaid=c-d;

	System.out.println("amount after discount"+costToPaid);
	sc.close();
}
}
