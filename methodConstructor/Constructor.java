package methodConstructor;

class Restaurant
{
	String name, area;
	long mobile;
	Restaurant(String name, String area, long mobile)
	{
		this.name = name;
		this.area = area;
		this.mobile = mobile;		
	}
	
	void display()
	{

		System.out.println("\nName " + name);
		System.out.println("Area " + area);
		System.out.println("Mobile " + mobile);
	}
}

public class Constructor
{
	public static void main(String[] args)
	{
		System.out.println("- - - Restaurant Details - - -");
		Restaurant thevar = new Restaurant("Thevar Restaurant", "Arulanadha Nagar, Thanjavur", 9897966977L);
		thevar.display();
		Restaurant ariyabavan = new Restaurant("Ariya Bavan", "South Rampart, Old Bus Stand, Thanjavur", 8668544332L);
		ariyabavan.display();
		Restaurant foodpalace = new Restaurant("Food Palace", "East Main Street, Thanjavur", 9785576827L);
		foodpalace.display();
		Restaurant tancafe = new Restaurant("Tan Cafe", "Medical College Road, Thanjavur", 7539988753L);
		tancafe.display();
		Restaurant vasanthabavan = new Restaurant("Vasantha Bavan", "South Rampart, Old Bus Stand, Thanjavur", 7668141431L);
		vasanthabavan.display();
	}
}