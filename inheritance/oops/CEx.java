package inheritance.oops;

class CarOil {
public void FillOil() {
System.out.println("The fuel is full in the car");
}
public void EmptyOil() {
System.out.println("The car has low oil");
}
} 
 
class Cars {
private int maxi_Speed;
public void carDetails(){
System.out.println("Maximum Speed= " + maxi_Speed);
}

public void setMaxiSpeed(int maxi_Speed)
{
this.maxi_Speed = maxi_Speed;
}
} 
 
class Compositon extends Cars {
public void COil() {
CarOil cOil = new CarOil();
cOil.FillOil();
}
} 
 
public class CEx {
public static void main(String[] args) {   
Compositon aCar = new Compositon();

aCar.setMaxiSpeed(180);
aCar.carDetails();
aCar.COil();
  }
}
