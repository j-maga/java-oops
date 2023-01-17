package abstraction;

import java.util.Scanner;

interface CoffeMachine
{	
	void display(int price, String coffee);
	
	char pay(Scanner sc);
	
	void paymentverify(char payment);
}

class CoffeeMacine implements CoffeMachine
{
	public void display(int price, String coffee) {
		System.out.println("You have ordered "+coffee +"\nPrice is Rs."+price);
		
	}

	@Override
	public char pay(Scanner sc) {
		System.out.println("Proceed to pay : y/n");
		char payment = sc.next().charAt(0);
		return payment;
	}

	@Override
	public void paymentverify(char payment) {
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

public class CoffeeInterface
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		int coffee;
		char payment;
		
		System.out.println("\n- - Coffee Machine - -");
		System.out.println("\t1.Black Coffee\n\t2.Cold Brew\n\t3.Cappuccino\nEnter your favourite");
		coffee = sc.nextInt();
		
		CoffeeMacine cm = new CoffeeMacine();
		
		switch(coffee)
		{
		case 1:
			cm.display(50, "Black Coffee");
			cm.paymentverify(cm.pay(sc));
			break;
		case 2:
			cm.display(60, "Cold Brew");
			cm.paymentverify(cm.pay(sc));
			break;
		case 3:
			cm.display(65, "Cappuccino");
			cm.paymentverify(cm.pay(sc));
			break;
		default:
			System.out.println("Sorry! We don't have other choices :(");
			break;
		}
	}

}
	
