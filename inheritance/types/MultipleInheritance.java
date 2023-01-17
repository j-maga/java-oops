package inheritance.types;

interface Fish
{
	void swim();
}

interface Bird
{
	void fly();
}

class Nature implements Fish, Bird
{
	public void swim()
	{
		System.out.println("Fish Swims ");
	}
	
	public void fly()
	{
		System.out.println("Birds Fly");
	}
}

public class MultipleInheritance {
	public static void main(String[] args) {
		Nature n = new Nature();
		n.swim();
		n.fly();
	}

}
