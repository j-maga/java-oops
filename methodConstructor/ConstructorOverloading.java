package methodConstructor;

class Dog
{
	
	Dog (boolean unused)
	{
	}
	
	Dog()
	{
		System.out.println("Parent");
	}
	
	Dog(String name)
	{
		System.out.println("Parent " + name);
	}
}

class Puppy extends Dog
{
	Puppy()
	{
		super("Leo");
		System.out.println("Child");
	}
	
	Puppy(String name)
	{
		super(true);
		System.out.println("Child " + name);
	}
}

public class ConstructorOverloading {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Dog dog1 = new Dog("Leo");
		Puppy puppy = new Puppy();
		Puppy puppy1 = new Puppy("Tiger");
	}

}
