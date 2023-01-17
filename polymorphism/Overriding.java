package polymorphism;

class Birds
{
	void display()
	{
		System.out.println("Birds have Wings.\nBirds Fly");
	}
}

class Penguin extends Birds
{
	void display()
	{
		System.out.println("\nPenguin have Wings.\nPenguin don't Fly");
	}
}

class Kiwi extends Birds
{
	void display()
	{
		System.out.println("\nKiwi don't have wings.\nKiwi don't Fly");
	}
}

public class Overriding {
	public static void main(String[] args) {
		Birds b = new Birds();
		Birds p = new Penguin();
		Birds k = new Kiwi();
		b.display();
		p.display();
		k.display();
	}

}
