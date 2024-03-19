package SuperAssignment;

public class Class2 extends Class1{

	
	public void check()
	{
		int n=super.add(100,100);
		if(n%10==0)
		{
		
			System.out.println("divisible");
			
		
		}
		else
		{
			
			System.out.println("not divisible");
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Class2 c=new Class2();
       c.check();
	}

}
