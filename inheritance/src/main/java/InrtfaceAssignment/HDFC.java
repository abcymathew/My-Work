package InrtfaceAssignment;
import java.util.Scanner;

public class HDFC implements Interface7 {
	double withraw;
	public  void recurringDeposit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount");
		double a=sc.nextDouble();
		System.out.println("enter duration");
		int d=sc.nextInt();
		withraw=d*a*I;
		System.out.println("withdraw amount after n period of time"+withraw);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC c=new HDFC();
		c.recurringDeposit();
		

	}

}
