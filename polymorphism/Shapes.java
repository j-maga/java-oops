package polymorphism;

class Polygon
{
	public void render()
	{
		System.out.println("Rendering Polygon . . .");
	}
}

class Square extends Polygon
{
	public void render()
	{
		System.out.println("Rendering Square . . .");
	}	
}

class Circle extends Polygon
{
	public void render()
	{
		System.out.println("Rendering Circle . . .");
	}
}

public class Shapes {
	public static void main(String[] args) {
		Polygon p = new Polygon();
		Square s = new Square();
		Circle c = new Circle();
		p.render();
		s.render();
		c.render();
	}

}
