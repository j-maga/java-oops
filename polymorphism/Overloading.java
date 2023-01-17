package polymorphism;

class BioData
{
	void display(String name, int age)
	{
		System.out.println("\n- - - Bio Data - - -\n\nName : " +name + "\nAge : " +age);
	}
	
	void display(String name, int age, char gender)
	{
		System.out.println("\n- - - Bio Data - - -\n\nName : " +name + "\nAge : " +age + "\nGender : "+gender);
	}
	
	void display(String name, int age, char gender, long mobileNum)
	{
		System.out.println("\n- - - Bio Data - - -\n\nName : " +name + "\nAge : " +age +"\nGender : "+gender + "\nMobile Num : "+mobileNum);
	}
}

public class Overloading {
	public static void main(String[] args) {
		BioData data = new BioData();
		data.display("Maga", 20, 'F', 7538877753L);
		data.display("Dora", 15);
	}

}
