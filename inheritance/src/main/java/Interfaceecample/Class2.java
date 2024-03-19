package Interfaceecample;

public class Class2 implements Interface1 {
	public void display()
	{
		System.out.println("hi");
		}
	public void show()
	{
		System.out.println("hey how are you");
		System.out.println(A);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class2 c=new Class2();
		c.display();
		c.show();

	}

}
