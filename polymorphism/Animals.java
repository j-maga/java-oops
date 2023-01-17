package polymorphism;

class Animal
{
	void display()
	{
		System.out.println("Animal walks\n");
	}
}

class Bear extends Animal
{
	void display()
	{
		System.out.println("Bear walks with 2 legs");
	}
}

class Ant extends Animal
{
	void display()
	{
		System.out.println("Ant walks with 6 legs");
	}
}

class Spider extends Animal
{
	void display()
	{
		System.out.println("Ant walks with 8 legs");
	}
}

class Crab extends Animal
{
	void display()
	{
		System.out.println("Crab walks with 10 legs");
	}
}

public class Animals {
	public static void main(String[] args) {
		Animal a = new Animal();
		Animal b = new Bear();
		Animal an = new Ant();
		Animal s = new Spider();
		Animal c = new Crab();
		a.display();
		b.display();
		c.display();
		s.display();
		an.display();
	}

}
