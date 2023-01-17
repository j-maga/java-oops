package calculator;

public class Advanced {
	public int power(int a, int b)
	{
		return (int) Math.pow(a, b);
	}
	
	public int fact(int a)
	{
		int pro = 1;
		for(int i=1; i<=a; i++)
		{
			pro = pro *i;
		}
		return pro;
	}
	
	public int square(int a)
	{
		return a*a;
	}
	
	public float sqrt(int a)
	{
		return (float) Math.pow(a, 0.5);
	}
}
