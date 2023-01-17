package polymorphism;

import java.util.Scanner;

class Bank
{
	float calculate(int amount, float years, float rate)
	{
		float interest = (amount * years * rate)/100;
		float total = interest + amount;
		return total;
	}
	
	void display(float rate, float total)
	{
		System.out.println("\nInterest Rate : " + rate + "\nAmount at the time of Withdrawl : " + total);
	}
}

class SBI extends Bank
{
	void display(float rate, float total)
	{
		System.out.println("\nInterest Rate : " + rate + "\nAmount at the time of Withdrawl : " + total);
	}
}

class ICICI extends Bank
{
	void display(float rate, float total)
	{
		System.out.println("\nInterest Rate : " + rate + "\nAmount at the time of Withdrawl : " + total);
	}
}

class AXIS extends Bank
{
	void display(float rate, float total)
	{
		System.out.println("\nInterest Rate : " + rate + "\nAmount at the time of Withdrawl : " + total);
	}
}

public class BankInterestRate {
	public static void main(String[] args) {
		int amount, bank;
		float years, total, rate;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n- - - Bank Deposit Details - - -");
		System.out.println("\nEnter the Amount to Deposit : ");
		amount = sc.nextInt();
		System.out.println("Enter the Time Period in Years : ");
		years = sc.nextFloat();
		System.out.println("\nChoose any Bank : \n1.SBI Bank\n2.ICICI Bank\n3.AXIS Bank\n4.Other Banks");
		bank = sc.nextInt();
		
		Bank b = new Bank();
		Bank sbi = new SBI();
		Bank icici = new ICICI();
		Bank axis = new AXIS();
		
		switch(bank)
		{
		case 1:
			rate = 8.4f;
			total = b.calculate(amount, years, rate);
			sbi.display(rate, total);
			break;
		case 2:
			rate = 7.3f;
			total = b.calculate(amount, years, rate);
			icici.display(rate, total);
			break;
		case 3:
			rate = 9.7f;
			total = b.calculate(amount, years, rate);
			axis.display(rate, total);
			break;
		case 4:
			System.out.println("Enter the Rate of Interest : ");
			rate = sc.nextFloat();
			total = b.calculate(amount, years, rate);
			sbi.display(rate, total);
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
	}

}
