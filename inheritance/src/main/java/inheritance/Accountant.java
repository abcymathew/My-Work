package inheritance;

public class Accountant extends Employee
{
	public void display()
	{
		System.out.println("child class");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accountant a=new Accountant();
		a.print();
		a.display();
		System.out.println("salary"+a.salary);
	}

}
