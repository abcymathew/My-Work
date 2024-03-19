package Abstraction;

public class New extends AbstractExample {

	
	@Override
	public void show() { //implementation of abstract method
	  System.out.println("abstract method");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		New n=new New();
		n.show();
		n.display();

	}


}
