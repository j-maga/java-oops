package inheritance.oops;

class Employe
{
	  int id;
	  String name;
	  String dept;
	  Employe(int id, String name, String dept)
	  {
	    this.id = id;
	    this.name = name;
	    this.dept = dept;
	    System.out.println("\nEmployee name is " + name);
	    System.out.println("Employee Id is " + id);
	    System.out.println("Employee belongs to the " + dept + " Department");
	  }
}
	
class Department
{
	  String deptName;
	  int noOfemployees;
	  Department(String name, int numberOfemployees)
	  {
	    this.deptName = name;
	    this.noOfemployees = numberOfemployees;
	  }
}
	
class University
{
	  String universityName;
	  int noOfdepartments;
	  University(String name, int departments)
	  {
	    this.universityName = name;
	    this.noOfdepartments = departments;
	  }
}
	
public class Aggregation
{
	  public static void main(String[] args)
	  {
	    Employe e1 = new Employe(101, "Rishi", "Engineering");
	    Employe e2 = new Employe(167, "Rohan", "Management");
	    Employe e3 = new Employe(125, "Sneha", "Accounts");
	  }
}