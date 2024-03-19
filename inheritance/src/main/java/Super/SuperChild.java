package Super;

public class SuperChild extends SuperKeyword{
	int age;
	int id;

	public SuperChild(int a,int i) {
		super(10,2);
		age=a;
		id=i;
	}
	public void display()
	{
		super.display();
		String n=super.name;
		System.out.println(n);
		System.out.println("child class");
		System.out.println(age);
		System.out.println(id);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperChild s1=new SuperChild(11,2);
		s1.display();
	}

}
