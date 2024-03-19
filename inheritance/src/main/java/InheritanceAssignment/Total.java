package InheritanceAssignment;

public class Total extends Calculate {
	double totalsalary;
	public void total()
	{
		totalsalary=bp*hra*pf-deduct+bonus;
	}
	public void salaryslip()
	{
		System.out.println("basicpay"+bp);
		System.out.println("deduction"+deduct);
		System.out.println("hra"+hra);
		System.out.println("pf"+pf);
		System.out.println("bonus"+bonus);
		System.out.println("totalsalary"+totalsalary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Total t=new Total();
		
		
		
        t.get();
        t.cacul();
        t.total();
        t.salaryslip();
	}

}
