package inheritance.types;

class Super
{
	protected void display()
	{
		System.out.println("Parent Class");
	}
	
	void show()
	{
		System.out.println("Superclass has a Subclass");
	}
}

class Sub extends Super
{
	void show()
	{
		System.out.println("Child Class");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Super sup = new Super();
		Sub sub = new Sub();
		sub.display();
		sub.show();
		sup.show();
	}

}
