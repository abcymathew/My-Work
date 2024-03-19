package AbstractionAssignment;

import java.util.Scanner;

public class FullTimeEmployee extends Employee {
	final int HOUR=8;
	public void calculateSalary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter payment per hour");
		int p=sc.nextInt();
		float salary=p*8;
		System.out.println("salary is"+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullTimeEmployee f=new FullTimeEmployee();
		f.calculateSalary();
		Contractor c=new Contractor();
		c.calculateSalary();
		f.calculateSalary();

	}

}
