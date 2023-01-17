package inheritance.oops;

class Student {
	  int id;
	  String name;
	  String school_name;
	  Student(int id, String name, String school_name) { 
	    this.id = id;
	    this.name = name;
	    this.school_name = school_name;
	    System.out.println("\nStudent name is " + name);
	    System.out.println("Student Id is " + id);
	    System.out.println("Student belongs to the " + school_name + "School");
	  }
	}
	class school {
	  String schoolName;
	  int noOfStudents;
	  school(String name, int numberOfStudents) {
	    this.schoolName = name;
	    this.noOfStudents = numberOfStudents;
	  }
	}
	public class AEX {
	  public static void main(String[] args) {
	    Student n1 = new Student(28, "Maga", "AAMEC");
	  }
	}