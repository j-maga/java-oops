package mathematicalOperations;

import java.util.Scanner;

public class QualifiedName {
	public static void main(String[] args) {
		int choice, a, b;
		Scanner sc = new Scanner(System.in);
		
		calculator.Advanced ad = new calculator.Advanced();
		
		System.out.println("Enter num 1 - ");
		a=sc.nextInt();
		
		System.out.println("Enter num 2 - ");
		b=sc.nextInt();
		
		
		System.out.println("\n- - Simple Calculator - -");
		
		System.out.println("1.Factorial\t2.Power");
		System.out.println("3.Square\t4.Square Root");
		
		
		do
		{
			System.out.println("\nEnter your Choice ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Output "+ad.fact(a));
				break;
			case 2:
				System.out.println("Output "+ad.power(a, b));
				break;
			case 3:
				System.out.println("Output "+ad.square(a));
				break;
			case 4:
				System.out.println("Output "+ad.sqrt(a));
				break;
			}
		}while(choice>0 && choice <10);
		
	}
}
