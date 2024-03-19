package AbstractionAssignment;
import java.util.Scanner;

public class Contractor extends Employee  {
	public void calculateSalary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter payment per hour");
		int p=sc.nextInt();
		System.out.println("enter working hours");
		int w=sc.nextInt();
		float salary=p*w;
		System.out.println("salary is"+salary);
		
		
		
	}
	

}
