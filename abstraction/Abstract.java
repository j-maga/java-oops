package abstraction;

import java.util.Scanner;

abstract class HomeLoan
{
	abstract void rateofInterest(int amount, int months, float interest);
	
	void display(float interest, double emi, double tot_interest, double tot_Amount)
	{
		System.out.println("\nInterest Rate is "+interest);
		System.out.println("EMI is "+(int)emi);
		System.out.println("Total Interest is "+(int)tot_interest);
		System.out.println("Total Amount to be paid - "+(int)tot_Amount);
	}
}

class EMI extends HomeLoan
{
	@Override
	void rateofInterest(int amount, int months, float interest)
	{
		float ri = interest/1200;
		double Ri = Math.pow((1+ ri), (months));
		double emi = amount * ri * (Ri / (Ri-1));
		double tot_Amount = emi * months;
		double tot_interest = tot_Amount - amount;
		super.display(interest, emi, tot_interest, tot_Amount);
	}
}
public class Abstract {
	public static void main(String[] args) {
		
		EMI emi = new EMI();
		Scanner sc = new Scanner(System.in);
		
		int amount, months, bank;
		float interest;
				
		System.out.println("-- Home Loan Apply Details --");
		System.out.println("\nChoose any bank to apply Loan \n1.SBI \t 2.ICICI \t 3.AXIS");
		bank = sc.nextInt();
		
		System.out.println("Loan Amount ");
		amount = sc.nextInt();
		
		System.out.println("No. of Months ");
		months = sc.nextInt();
		
		switch(bank)
		{
		case 1:
			interest = 7.5f;
			emi.rateofInterest(amount, months, interest);
			break;
			
		case 2:
			interest = 8.2f;
			emi.rateofInterest(amount, months, interest);
			break;
			
		case 3:
			interest = 6.8f;
			emi.rateofInterest(amount, months, interest);
			break;
		
		default:
			System.out.println("Unable to process the Loan Application, Select Valid Bank !");
			break;
		}
	}

}
