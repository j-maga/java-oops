package inheritance.oops;

class Person {
String name;
double id;

Person(String name, double id2) {
this.name = name;
this.id = id2;
}
}  

class AadharCard extends Person {
String personName;
AadharCard(String name, double id) {
super(name, id);
this.personName = name;
}
}

public class AsEx {
public static void main(String args[]) {
AadharCard obj = new AadharCard("Maga", 417443234);
System.out.println(obj.personName + " is a person with an Aadhar number: " + obj.id);
}
}