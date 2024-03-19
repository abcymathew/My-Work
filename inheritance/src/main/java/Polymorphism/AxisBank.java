package Polymorphism;

public class AxisBank extends Bank {
	float intere=7.5f;
	public void interest()
	{
		System.out.println(intere+"is the interst of axis bank");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Bank b=new AxisBank();
	   b.interest();
	   //Bank a=new Bank();
	  // a.interest();
		
           
	}

}
