import java.util.Scanner;
public class DetermineEven2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		boolean Num1Ev, Num2Ev;
		
		System.out.print("Please enter first number: ");
		int val1 = kb.nextInt();
		
		System.out.print("Please enter Second number: ");
		int val2 = kb.nextInt();
		
		Num1Ev = FindEven(val2);
		Num2Ev = FindEven(val1);
		
		Results(val1, val2, Num1Ev, Num2Ev);
	
	}
	public static boolean FindEven(int number)
	{	
		return number%2==0;
	}
	
	public static void Results(int val1, int val2, boolean Num1Ev, boolean Num2Ev) 
	{
        System.out.println(val1 + " is even: " + Num1Ev);
        System.out.println(val2 + " is even: " + Num2Ev);
    }
}