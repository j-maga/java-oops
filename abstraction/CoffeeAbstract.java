package abstraction;

import java.util.Scanner;

abstract class CoffeeMachine
{
	abstract int price();
	
	char pay(Scanner sc)
	{
		System.out.println("Proceed to pay : y/n");
		char payment = sc.next().charAt(0);
		return payment;
	}
	
	void display(int price, String coffee)
	{
		System.out.println("You have ordered "+coffee +"\nPrice is Rs."+price);
	}
	
	void paymentverify(char payment)
	{
		if(payment=='y')
		{
			System.out.println("Your Coffee will be ready in few minutes!\nHave a Nice Day :)");
		}
		else if(payment=='n')
		{
			System.out.println("It's Okay. Hope See you again!");
		}
		else
		{
			System.out.println("Not a valid option!");
		}
	}
}

class ColdBrew extends CoffeeMachine
{
	@Override
	int price()
	{
		return 60;
	}
}

class Cappuccino  extends CoffeeMachine
{
	int price()
	{
		return 65;
	}
}

class BlackCoffee  extends CoffeeMachine
{
	int price()
	{
		return 50;
	}
}

public class CoffeeAbstract {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int coffee;
		char payment;
		
		System.out.println("\n- - Coffee Machine - -");
		System.out.println("\t1.Black Coffee\n\t2.Cold Brew\n\t3.Cappuccino\nEnter your favourite");
		coffee = sc.nextInt();
		
		ColdBrew cb = new ColdBrew();
		Cappuccino cc = new Cappuccino();
		BlackCoffee bc = new BlackCoffee();
		
		switch(coffee)
		{
		case 1:
			bc.display(bc.price(), "Black Coffee");
			bc.paymentverify(bc.pay(sc));
			break;
		case 2:
			cc.display(cc.price(), "Cold Brew");
			cc.paymentverify(cc.pay(sc));
			break;
		case 3:
			cb.display(cb.price(), "Cappuccino");
			cb.paymentverify(cb.pay(sc));
			break;
		default:
			System.out.println("Sorry! We don't have other choices :(");
			break;
		}
		
	}

}
