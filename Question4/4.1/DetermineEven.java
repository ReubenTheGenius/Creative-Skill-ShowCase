import java.util.Scanner;
public class DetermineEven
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		boolean ansVal, ansVal2;
		
		System.out.print("Please enter first number: ");
		int val1 = kb.nextInt();
		
		System.out.print("Please enter Second number: ");
		int val2 = kb.nextInt();
		
		ansVal = FindEven(val1);
		ansVal2 = FindEven(val2);
		
		
		System.out.println(val1 +" is even? "+ ansVal);
		System.out.print(val2 +" is even? "+ ansVal2);
		
		
	
	}
	public static boolean FindEven(int number)
	{	
		return number%2==0;
	}
}