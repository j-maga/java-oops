package abstraction;

abstract class Employee
{
	String name, mail;
	int id;
	long mobile;
	
	Employee()
	{
		System.out.println("\n\n- - - Employee Details - - -");
	}
		
	abstract void dept();
	
	void shift()
	{
		String shift = "Day";
		System.out.println("Shift \t: "+shift);
	}
}

class Engineer extends Employee
{
	Engineer(String name, int id, String mail, long mobile)
	{
		this.name=name;
		this.id = id;
		this.mail = mail;
		this.mobile = mobile;
	}
	
	void dept()
	{
		String dept = "Engg";
		System.out.println("\nName \t: "+name +"\nID \t: "+id +"\nMail \t: "+mail +"\nMobile \t: "+mobile +"\nDept \t: "+dept);
		super.shift();
	}
}

class Finance extends Employee
{
	Finance(String name, int id, String mail, long mobile)
	{
		this.name=name;
		this.id = id;
		this.mail = mail;
		this.mobile = mobile;
	}
	
	void dept()
	{
		String dept = "Finance";
		System.out.println("\nName \t: "+name +"\nID \t: "+id +"\nMail \t: "+mail +"\nMobile \t: "+mobile +"\nDept \t: "+dept);
		super.shift();
	}
}

public class AbsConstructor
{
	public static void main(String[] args)
	{
		Employee engi1 = new Engineer("Maga", 16, "magaj@gmail.com", 7538877753L);
		engi1.dept();
		Employee engi2 = new Engineer("Alice", 2, "alice@yahoo.com", 8098562728L);
		engi2.dept();
		Employee f1 = new Finance("Bob", 5, "bobbob@gmail.com", 9365693556L);
		f1.dept();
		Employee f2 = new Finance("Carrie", 9, "carrie@yahoo.com", 6368370489L);
		f2.dept();
	}
}