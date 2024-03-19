package ThisKeyword;

public class Factorial {
	int a;
	int fact=1;
	public int calculate(int n)
	{
		int i=1;
		while(i<=n)
		{
		fact=fact*i;
		i++;
		}
		return fact;
	}
	public void result()
	{
		a=this.calculate(5);
		System.out.println("factorial is"+a);
		
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Factorial f=new Factorial();
		f.result();
		

	}

}
