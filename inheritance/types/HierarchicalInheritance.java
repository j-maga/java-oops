package inheritance.types;

class Flower
{
	Flower()
	{
	}
	
	Flower(String name)
	{
		System.out.println("\nFlower" + name);
	}
	
	void display()
	{
		System.out.println("\nAll Flowers have unique fragance");
	}
}

class Sunflower extends Flower
{
	Sunflower()
	{
		super(" - Sunflower");
	}
	void display()
	{
		System.out.println("Sunflower is Yellow in color");
	}
}

class Hibiscus extends Flower
{
	Hibiscus()
	{
		super(" - Hibiscus");
	}
	void display()
	{
		System.out.println("Hibiscus is Red in color");
	}
}

class Lily extends Flower
{
	Lily()
	{
		super(" - Lily");
	}
	void display()
	{
		System.out.println("Lily is white in color");
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		Flower F = new Flower();
		Sunflower sf = new Sunflower();
		sf.display();
		Hibiscus hi = new Hibiscus();
		hi.display();
		Lily li = new Lily();
		li.display();
		F.display();
	}

}
