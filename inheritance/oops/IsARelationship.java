package inheritance.oops;

interface Fish
{
void swim();
}

interface Bird
{
void fly();
}

interface Nature extends Fish, Bird
{
public void nature();
}
	
class Display implements Nature
{
	public void nature()
	{
		System.out.println("Nature of the Fish and Bird ");
	}

public void swim()
	{
		System.out.println("Fish Swims ");
	}
	
	public void fly()
	{
		System.out.println("Birds Fly");
	}
}
public class IsARelationship
{
public static void main(String[] args) {
Display m = new Display();
m.nature();
m.swim();
m.fly();
}}
