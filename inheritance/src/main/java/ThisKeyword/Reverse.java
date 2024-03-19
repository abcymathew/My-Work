package ThisKeyword;

public class Reverse {
	int n,rem;
	int rev=0;
	
	public Reverse(int n)
	{
		this.n=n;
		while(n!=0)
		{
		this.rem=n%10;
		this.rev=rev*10+rem;
		n=n/10;
		
		}
	}
	public Reverse()
	{
		this(355);
		System.out.println("reverse is"+rev);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse r=new Reverse();

	}

}
