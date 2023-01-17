package inheritance.multilevel;

class Grandpa
{
	void display()
	{
		System.out.println("Super Class");
	}
}

class Father extends Grandpa
{
	void display()
	{
		System.out.println("Subclass 1");
	}
}

class Son extends Father
{
	void display()
	{
		System.out.println("Subclass 2");
	}
}

public class MultilevelInheritance {
	public static void main(String[] args) {
		Grandpa g = new Grandpa();
		Grandpa f = new Father();
		Grandpa s = new Son();
		s.display();
		f.display();
		g.display();
	}

}