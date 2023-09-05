import java.util.Scanner;

public class PassFail
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		double summative1, summative2;
		
		
		System.out.print("Please enter Results for Summative 1: ");
		summative1 = kb.nextDouble();
		
		System.out.print("Please enter Results for Summative 2: ");
		summative2 = kb.nextDouble();
		
		if(getResults(summative1, summative2))
		{
			System.out.print("Your grade is above 50 youve passed");
		}
		else
		{
			System.out.print("Your grade is below 50 youve failed");
		}
		
	}
	
	public static boolean getResults(double summative1, double summative2)
	{	
		return summative1 >49.9 || summative2 >49.9;
	}
}