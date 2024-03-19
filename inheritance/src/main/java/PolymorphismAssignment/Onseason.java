package PolymorphismAssignment;

import java.util.Scanner;

public class Onseason extends Offseason{
	double dis;
	double costToPaid;

	public void discount()
	{
		
		System.out.println("current bill for onseason");
		Scanner sc=new Scanner(System.in);
		 c=sc.nextDouble();
		
		dis=c*0.40;
		costToPaid=c-dis;
		System.out.println("discount for onseason"+dis);
		System.out.println("amount after discount"+costToPaid);
	

	}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter an option");
		Scanner sc=new Scanner(System.in);
		
		int option=sc.nextInt();
		switch(option)
		{
		case 1:
			Onseason o=new Onseason();
			o.discount();
			break;
		case 2:
			Offseason o1=new Offseason();
			o1.discount();
			break;
			default:
				System.out.println("invlaid");
				break;
		}
		
sc.close();

		
	}

}
