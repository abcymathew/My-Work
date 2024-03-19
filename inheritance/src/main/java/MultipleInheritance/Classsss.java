package MultipleInheritance;

public class Classsss implements Interface4{
	int sum;
	public void display()
	{
		System.out.println("first interface");
	}
	public void show()
	{
		System.out.println(B);
	}
	public void run()
	{
		System.out.println("second interface");
	}
	public void hi()
	{
		System.out.println(C);
		
	}
	public void sum()
	{
		System.out.println("third interface");
	}
	public void print()
	{
		System.out.println(sum=B+C+D);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classsss c=new Classsss();
		c.display();
		c.show();
		c.run();
		c.hi();
		c.sum();
		c.print();
		

	}

}
