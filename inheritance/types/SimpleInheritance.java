package inheritance.types;

class Cat
{
	Cat()
	{
		System.out.println("Meow");
	}
	
	void sleep()
	{
		System.out.println("Zzz\n");
	}
	
	void display()
	{
		System.out.println("I'm Parent - Cat");
	}
	
}

class Kitten extends Cat
{
	void display()
	{
		System.out.println("I'm Child - Kitten");
	}
}

public class SimpleInheritance {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.display();
		c.sleep();
		Kitten k = new Kitten();
		k.display();
		k.sleep();
	}

}
