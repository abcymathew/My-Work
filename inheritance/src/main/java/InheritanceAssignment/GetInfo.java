package InheritanceAssignment;
import java.util.*;
public class GetInfo {
	double bp;
	double deduct;
	double bonus;
	public void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter basic pay");
		 bp=sc.nextDouble();
		 System.out.println("enter deduction");
	    deduct=sc.nextDouble();
	    System.out.println("enter bonus");
	    bonus=sc.nextDouble();
		sc.close();
	}

}
