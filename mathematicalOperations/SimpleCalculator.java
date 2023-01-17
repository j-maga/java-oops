package mathematicalOperations;

import calculator.*;
import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		int choice, a, b;
		Scanner sc = new Scanner(System.in);
		Basic ba = new Basic();
		Advanced ad = new Advanced();
		
		System.out.println("Enter num 1 - ");
		a=sc.nextInt();
		
		System.out.println("Enter num 2 - ");
		b=sc.nextInt();
		
		
		System.out.println("\n- - Simple Calculator - -");
		System.out.println("\n1.Addition\t2.Subtraction\t3.Multiplication");
		System.out.println("4.Division\t5.Remainder\t6.Factorial");
		System.out.println("7.Power\t\t8.Square\t9.Square Root");
		
		
		do
		{
			System.out.println("\nEnter your Choice ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Output "+ba.add(a, b));
				break;
			case 2:
				System.out.println("Output "+ba.sub(a, b));
				break;
			case 3:
				System.out.println("Output "+ba.mul(a, b));
				break;
			case 4:
				System.out.println("Output "+ba.div(a, b));
				break;
			case 5:
				System.out.println("Output "+ba.rem(a, b));
				break;
			case 6:
				System.out.println("Output "+ad.fact(a));
				break;
			case 7:
				System.out.println("Output "+ad.power(a, b));
				break;
			case 8:
				System.out.println("Output "+ad.square(a));
				break;
			case 9:
				System.out.println("Output "+ad.sqrt(a));
				break;
			}
		}while(choice>0 && choice <10);
		
	}

}