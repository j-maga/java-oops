package methodConstructor;

import java.util.Scanner;

public class Methods {
	
	int add(int a, int b)
	{
		int output=a+b;
		return output;
	}
	
	int subtract(int a, int b)
	{
		int output=a-b;
		return output;
	}
	
	public static void main(String args[])
	{
		int num1, num2, choice, output;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num 1 ");
		num1 = sc.nextInt();
		System.out.println("Enter num 2 ");
		num2 = sc.nextInt();
		
		Methods ms = new Methods();
		
		System.out.println("\n1.Addition\n2.Subtraction\n\nEnter your choice ");
		choice = sc.nextInt();
		
		if (choice==1)
		{
			output = ms.add(num1, num2);
			System.out.println("\nSum is " + output);
		}
		else if (choice==2)
		{
			output = ms.subtract(num1, num2);
			System.out.println("\nDifference is " + output);
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}

}