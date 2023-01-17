package methodConstructor;

import java.util.Scanner;

class StudentDetails
{
	String name;
	int rollNo;
	String dept;
	long mobile;
	float cutOff;
	
	StudentDetails(String name, int rollNo, String dept, long mobile, float cutOff)
	{
		this.name = name;
		this.rollNo = rollNo;
		this.dept = dept;
		this.mobile = mobile;
		this.cutOff = cutOff;
	}
	
	void display()
	{
		System.out.println("\n\n- - - Student Details - - -");
		System.out.println("\nName : " + name + "\nRoll No : " + rollNo + "\nDepartment : " + dept + "\nMobile "+ mobile + "\nCut Off Mark :" + cutOff);
	}
}

public class ParameterizedConstructor {
	public static void main(String[] args)
	{
		String name;
		int rollNo;
		String dept;
		long mobile;
		float cutOff;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Details\n");
		System.out.println("Enter name ");
		name = sc.next();
		System.out.println("Enter Roll Number ");
		rollNo = sc.nextInt();
		System.out.println("Enter Departmrnt ");
		dept = sc.next();
		System.out.println("Enter Mobile Number ");
		mobile = sc.nextLong();
		System.out.println("Enter Cut Off Marks ");
		cutOff = sc.nextFloat();
		
		StudentDetails student1 = new StudentDetails(name, rollNo, dept, mobile, cutOff);
		student1.display();
	}

}
